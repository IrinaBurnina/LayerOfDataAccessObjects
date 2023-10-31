package ir.bu.dao.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RepositoryForBD {
    private final String queryScript;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public RepositoryForBD(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.queryScript = read("selectProduct.sql");
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProductName(String name) {
        var parameters = new HashMap<String, Object>();
        parameters.put("name", name);
        var resultSet = namedParameterJdbcTemplate.query(queryScript,
                parameters,
                (rs, rowNum) -> rs.getString("product_name"));
        return resultSet;
    }
}
