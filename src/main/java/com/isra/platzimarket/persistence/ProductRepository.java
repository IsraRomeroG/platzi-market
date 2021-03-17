package com.isra.platzimarket.persistence;

import com.isra.platzimarket.persistence.crud.ProductCrudRepository;
import com.isra.platzimarket.persistence.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        if(productCrudRepository == null){
            System.out.println("ELOBJETO ES NULO");
        }
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory){
        return (List<Product>)productCrudRepository.findByIdCategory(idCategory);
    }
}
