package ir.bu.dao.service;

import ir.bu.dao.repository.RepositoryForBD;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final RepositoryForBD repository;

    public Service(RepositoryForBD repository) {
        this.repository = repository;
    }

    public List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
