package com.doa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entities.Category;

@RepositoryRestResource
public interface CategoryRepository extends MongoRepository<Category, String> {

}
