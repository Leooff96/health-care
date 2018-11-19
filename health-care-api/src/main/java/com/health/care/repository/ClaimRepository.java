package com.health.care.repository;

import com.health.care.domain.Claim;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClaimRepository extends MongoRepository<Claim,String> {
}