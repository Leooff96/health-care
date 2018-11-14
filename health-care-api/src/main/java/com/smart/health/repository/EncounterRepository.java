package com.smart.health.repository;

import com.smart.health.domain.Encounter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncounterRepository extends MongoRepository<Encounter,String> {
}