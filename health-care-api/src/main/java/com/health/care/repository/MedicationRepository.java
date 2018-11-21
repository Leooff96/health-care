package com.health.care.repository;

import com.health.care.domain.Medication;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends MongoRepository<Medication,String> {
}