package com.gedal.eventviewer.dto;

import java.io.Serializable;

import com.gedal.eventviewer.domain.Event;

import lombok.Getter;
import lombok.Setter;

public class EventDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Getter @Setter private String id;
	@Getter @Setter private String nameEvent;
	@Getter @Setter private String dateEvent;
	@Getter @Setter private String description;
	@Getter @Setter private String location;
	@Getter @Setter private String howToSee;
	
	public EventDTO() {
		
	}
	
	public EventDTO(Event obj) {
		id = obj.getId();
		nameEvent = obj.getNameEvent();
		dateEvent = obj.getDateEvent();
		description = obj.getDescription();
		location = obj.getLocation();
		howToSee = obj.getHowToSee();
		
	}
	

}
