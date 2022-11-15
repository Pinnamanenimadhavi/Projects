package com.madhavi.stadium.admin.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madhavi.stadium.admin.entity.Event;
import com.madhavi.stadium.admin.entity.EventEntity;
import com.madhavi.stadium.admin.repo.EventRepository;
import com.madhavi.stadium.admin.service.StadiumService;

@RestController
public class StadiumAdminEventContoller {
	@Autowired
	private EventRepository repo;
	@Autowired
	private StadiumService stadiumService;
	@RequestMapping("/showEventDetails")
	public Object showEventDetails(@RequestParam("id") Long id) {
		return repo.findById(id);
		}
	@GetMapping("/showEventDetailsByName")
	public Object showEventDetailsByName(@RequestParam("name") String name) {
		return repo.findByName(name);
		}
	@GetMapping("/showEventDetailsByDate")
	public Object showEventDetailsByDate(@RequestParam("date") Date date) {
		return repo.findByDate(date);
		}
	@PostMapping("/createEventDetails")
	public Object createEventDetails(@RequestBody Event event) {
		return stadiumService.saveEvent(event);
		
	}
	
	/*@PostMapping("/createEventDetails")
	public Object createEventDetails(@RequestBody EventEntity evententity) {
		Event event=new Event();
		event.setName(evententity.getName());
		event.setPlace(evententity.getPlace());
		event.setDate(evententity.getDate());
		event.setDiscription(evententity.getDiscription());
		return stadiumService.saveEvent(event);
	}*/
	@PutMapping("/updateEventDetails")
	public Object updateEventDetails(@RequestBody EventEntity evententity) {
		Event event=new Event();
		event.setId(evententity.getId());
		event.setName(evententity.getName());
		event.setPlace(evententity.getPlace());
		event.setDate(evententity.getDate());
		event.setDiscription(evententity.getDiscription());
		return stadiumService.updateEvent(event);
	}
	@DeleteMapping("/deleteEventDetails")
	public Object deleteEventDetails(@RequestParam("id")Long id) {
		 repo.deleteById(id);
		return "Event Deleted with id";
	}
	
}
