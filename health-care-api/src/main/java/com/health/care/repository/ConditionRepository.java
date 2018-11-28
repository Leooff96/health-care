package com.health.care.repository;

import java.util.List;

import com.health.care.domain.Condition;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends MongoRepository<Condition, String>{

    @Query("{'DESCRIPTION' : {$regex : '^((?!disorder).)*$'}}")
    List<Condition> findByPatientAndEncounter();  
}