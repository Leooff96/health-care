package com.smart.health.repository;

import com.smart.health.domain.Medication;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends MongoRepository<Medication,String> {
}