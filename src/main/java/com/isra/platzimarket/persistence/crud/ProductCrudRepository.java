package com.isra.platzimarket.persistence.crud;

import com.isra.platzimarket.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product, Integer>{

    List<Product> findByIdCategory(int idCategory);

    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Product> getByCategory(int idCategory);
}
