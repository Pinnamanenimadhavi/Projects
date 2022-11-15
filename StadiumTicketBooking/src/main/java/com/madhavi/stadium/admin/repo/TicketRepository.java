package com.madhavi.stadium.admin.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.madhavi.stadium.admin.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

    Optional<Ticket> findById(Long id);
    
    
}