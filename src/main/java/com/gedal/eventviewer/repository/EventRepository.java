package com.gedal.eventviewer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gedal.eventviewer.domain.Event;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
	
}
