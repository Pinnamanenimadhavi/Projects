package com.madhavi.stadium.admin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhavi.stadium.admin.entity.Event;
import com.madhavi.stadium.admin.repo.EventRepository;

@Service
public class StadiumService {
	@Autowired
	private EventRepository repo;
	
	public Object saveEvent(Event event) {
		if(event.getPlace()==null) {
			return "Place is required";
		}
		return repo.save(event);
	}
	
	public Object updateEvent(Event event) {
		Optional<Event> e=repo.findById(event.getId());
		Event o=e.get();
		o.setName(event.getName());
		o.setPlace(event.getPlace());
		o.setDate(event.getDate());
		o.setDiscription(event.getDiscription());		
		return repo.save(o);
	}

}
