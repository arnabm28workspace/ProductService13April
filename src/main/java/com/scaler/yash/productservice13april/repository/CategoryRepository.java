package com.scaler.yash.productservice13april.repository;

import com.scaler.yash.productservice13april.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByName(String name);

    List<Category> findAll();

    @Query(value = "select c from Category c LEFT JOIN FETCH c.products")
    Category myOwnSQLForGettingProductFromDBByIdWithoutN(Integer id);
}
