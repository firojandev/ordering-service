package com.experiment.order.modules.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT new Product(p.id,p.productCode, p.productName) FROM Product p WHERE p.productCode LIKE %:keyword1% OR p.productName LIKE %:keyword2%")
    List<Product> findByProductCodeLikeOrProductNameLike(@Param("keyword1") String keyword1, @Param("keyword2") String keyword2);
    //List<Product> findByProductCodeLikeOrProductNameLike(String keyword1, String keyword2);
}
