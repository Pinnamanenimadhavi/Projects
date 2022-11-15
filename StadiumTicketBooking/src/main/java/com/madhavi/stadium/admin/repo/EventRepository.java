package com.madhavi.stadium.admin.repo;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.madhavi.stadium.admin.entity.Event;

public interface EventRepository extends CrudRepository<Event, Long>{
	
	Optional<Event> findById(long id);	
	List<Event> findByName(String name);
	List<Event> findByDate(Date date);
	
	//public boolean saveEvent(Event event);
//	Optional<Event> findByName(String name);
	//public boolean deleteEvent(Event event);
//	public boolean updateEventById(Long id);

//	Object deleteByName(String name);

}
