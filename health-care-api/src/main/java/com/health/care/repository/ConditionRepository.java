package com.health.care.repository;

import com.health.care.domain.Condition;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends MongoRepository<Condition, String>{
}