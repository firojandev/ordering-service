package com.experiment.order.modules.products;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface ProductService{
    List<Product> findAll();
    List<Product> findByCodeAndName(String keyword);
    Page<Product> findByPage(int page, int size);
    Optional<Product> save(Product product);
}
