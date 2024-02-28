package com.unitbv.tst.repository;

import com.unitbv.tst.entity.Order;
import com.unitbv.tst.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByNameOrderByLastUpdate(String name);

}
