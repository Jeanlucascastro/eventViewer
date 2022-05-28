package com.gedal.eventviewer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gedal.eventviewer.domain.Event;
import com.gedal.eventviewer.dto.EventDTO;
import com.gedal.eventviewer.repository.EventRepository;
import com.gedal.eventviewer.services.exception.ObjectNotFoundException;

@Service
public class EventService {
	
	@Autowired
	private EventRepository repo;
	
	public List<Event> findAll(){
		return repo.findAll();
	}
	
	public Event findById(String id) {
		Optional<Event> event = repo.findById(id);
		return event.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
	public Event insert(Event obj) {
		return repo.insert(obj);
	}
	
	public Event fromDTO(EventDTO objDTO) {
		return new Event(objDTO.getId(), 
				objDTO.getNameEvent(),
				objDTO.getDateEvent(), 
				objDTO.getDescription(),
				objDTO.getLocation(), 
				objDTO.getHowToSee());
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Event update(Event obj) {
		Event newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
		
	}

	private void updateData(Event newObj, Event obj) {
		newObj.setNameEvent(obj.getNameEvent());
		newObj.setDateEvent(obj.getDateEvent());
		newObj.setDescription(obj.getDescription());
		newObj.setLocation(obj.getLocation());
		newObj.setHowToSee(obj.getHowToSee());
	}
	
}