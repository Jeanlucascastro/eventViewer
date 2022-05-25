package com.gedal.eventviewer.domain;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class Event implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Getter @Setter private String id;
	@Getter @Setter private String nameEvent;
	@Getter @Setter private String dateEvent;
	@Getter @Setter private String description;
	@Getter @Setter private String location;
	@Getter @Setter private String howToSee;
	
	public Event () {
		
	}

	public Event(String id, String nameEvent, String dateEvent, String description, String location, String howToSee) {
		super();
		this.id = id;
		this.nameEvent = nameEvent;
		this.dateEvent = dateEvent;
		this.description = description;
		this.location = location;
		this.howToSee = howToSee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateEvent == null) ? 0 : dateEvent.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((nameEvent == null) ? 0 : nameEvent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (dateEvent == null) {
			if (other.dateEvent != null)
				return false;
		} else if (!dateEvent.equals(other.dateEvent))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (nameEvent == null) {
			if (other.nameEvent != null)
				return false;
		} else if (!nameEvent.equals(other.nameEvent))
			return false;
		return true;
	}
	
	
	
	
}
