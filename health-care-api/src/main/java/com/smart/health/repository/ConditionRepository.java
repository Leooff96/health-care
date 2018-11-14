package com.smart.health.repository;

import com.smart.health.domain.Condition;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends MongoRepository<Condition, String>{
}