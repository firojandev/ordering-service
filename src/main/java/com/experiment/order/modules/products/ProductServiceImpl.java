package com.experiment.order.modules.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository mProductRepository;

    @Override
    public List<Product> findAll() {
        return mProductRepository.findAll();
    }

    @Override
    public Page<Product> findByPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return mProductRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> save(Product product) {
       Product savedProduct = mProductRepository.save(product);
        return Optional.of(savedProduct);
    }

}
