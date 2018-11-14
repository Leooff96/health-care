package com.smart.health.repository;

import com.smart.health.domain.Allergie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergieRepository extends MongoRepository<Allergie,String> {
}