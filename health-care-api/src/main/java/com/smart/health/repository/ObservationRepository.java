package com.smart.health.repository;

import com.smart.health.domain.Observation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * ObservationsRepository
 */

@Repository
public interface ObservationRepository extends MongoRepository<Observation, String>{
}