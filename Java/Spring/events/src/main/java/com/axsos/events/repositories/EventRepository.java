package com.axsos.events.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.events.models.Event;
@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    public List<Event> findAll();
    public List<Event> findBylocation(String loc);
    public List<Event> findBylocationNotContains(String loc);
}
