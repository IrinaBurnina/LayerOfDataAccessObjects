package ir.bu.dao.service;

import ir.bu.dao.repository.RepositoryForBD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBD {
    private final RepositoryForBD repository;

    public ServiceBD(RepositoryForBD repository) {
        this.repository = repository;
    }

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
