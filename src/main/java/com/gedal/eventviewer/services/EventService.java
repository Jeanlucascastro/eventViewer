package com.gedal.eventviewer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gedal.eventviewer.domain.Event;
import com.gedal.eventviewer.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository repo;
	
	public List<Event> findAll(){
		return repo.findAll();
	}
}
