package com.gedal.eventviewer.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gedal.eventviewer.domain.Event;

@RestController
@RequestMapping(value="/events")
public class EventResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Event>> findAll() {
		Event chuvaMeteoros = new Event("1", "Chuva de Meteroros", "dia 31", "meteoros passando", "planeta terra", "olhando para o ceu de madrugada");
		Event NRDOPL = new Event("2", "Na rua de olho para lua", "dia 31", "meteoros passando", "planeta terra", "olhando para o ceu de madrugada");
		List<Event> list = new ArrayList<>();
		list.addAll(Arrays.asList(chuvaMeteoros,NRDOPL));
		return ResponseEntity.ok().body(list);
	}
}
