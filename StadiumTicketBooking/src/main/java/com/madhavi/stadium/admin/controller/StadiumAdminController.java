package com.madhavi.stadium.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madhavi.stadium.admin.repo.TicketRepository;

@RestController
public class StadiumAdminController {
	@Autowired
	private TicketRepository repo;
	@RequestMapping("/getTicketDetails")
	public Object getTicketDetails(@RequestParam("id") Long id) {
		return repo.findById(id);
		
		
		
	}

}
