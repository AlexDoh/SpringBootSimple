package com.odmytrenko.spring.service;

import com.odmytrenko.spring.model.Event;

import java.util.Date;
import java.util.List;

public interface EventService {

    List<Event> getAllEvents();

    Event addEvent(Event event);

    List<Event> getEventsByDate(Date date);
}
