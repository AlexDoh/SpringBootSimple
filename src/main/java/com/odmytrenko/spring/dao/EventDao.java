package com.odmytrenko.spring.dao;

import com.odmytrenko.spring.model.Event;

import java.util.Date;
import java.util.List;

public interface EventDao {

    List<Event> getAllEvents();

    Event addEvent(Event event);

    Event getEvent(Date date);

}
