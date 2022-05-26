package com.gedal.eventviewer.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gedal.eventviewer.domain.Event;
import com.gedal.eventviewer.services.EventService;

@RestController
@RequestMapping(value="/events")
public class EventResource {
	
	@Autowired
	private EventService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Event>> findAll() {
		List<Event> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
