package com.health.care.repository;

import com.health.care.domain.Immunization;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmunizationRepository extends MongoRepository<Immunization, String>{
}