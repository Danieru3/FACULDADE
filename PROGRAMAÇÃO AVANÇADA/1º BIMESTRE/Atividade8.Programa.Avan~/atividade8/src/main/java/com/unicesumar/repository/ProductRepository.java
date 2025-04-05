package com.unicesumar.repository;

import com.unicesumar.entities.Product;

import java.util.*;

public class ProductRepository implements EntityRepository<Product> {
    private final List<Product> products = new LinkedList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Optional<Product> findById(UUID id) {
        return products.stream()
                .filter(p -> p.getUuid().equals(id))
                .findFirst();
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products); // retornar cópia
    }

    @Override
    public void deleteById(UUID id) {
        products.removeIf(p -> p.getUuid().equals(id));
    }
}
