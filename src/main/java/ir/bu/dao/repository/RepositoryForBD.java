package ir.bu.dao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryForBD {
    @PersistenceContext
    private EntityManager entityManager;

    public RepositoryForBD(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<String> getProductName(String name) {
        String queryText = "select o.productName from Order o where lower(o.customerId.name)=lower(:name)";
        List productNames = entityManager.createQuery(queryText)
                .setParameter("name", name)
                .getResultList();
        return productNames;
    }
}
