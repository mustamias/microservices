package org.com.dao;

import org.com.entities.company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<company, Long>{

}
