package com.doa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product, String> {

}
