package com.smart.health.repository;

import com.smart.health.domain.Condition;
import com.smart.health.domain.Immunization;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmunizationRepository extends MongoRepository<Immunization, String>{
}