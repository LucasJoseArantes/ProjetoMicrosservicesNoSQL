package com.iftm.startexample.start.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iftm.startexample.start.model.User;


@Repository
public interface UserRepository extends MongoRepository <User, ObjectId> {
}
