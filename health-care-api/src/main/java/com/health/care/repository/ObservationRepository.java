package com.health.care.repository;

import com.health.care.domain.Observation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * ObservationsRepository
 */

@Repository
public interface ObservationRepository extends MongoRepository<Observation, String>{
}