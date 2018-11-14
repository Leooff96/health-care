package com.smart.health.repository;

import com.smart.health.domain.Procedure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureRepository extends MongoRepository<Procedure,String> {

    
}