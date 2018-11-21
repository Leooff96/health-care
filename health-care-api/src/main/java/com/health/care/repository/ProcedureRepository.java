package com.health.care.repository;

import com.health.care.domain.Procedure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureRepository extends MongoRepository<Procedure,String> {

    
}