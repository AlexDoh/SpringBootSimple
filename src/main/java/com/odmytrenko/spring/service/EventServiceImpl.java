package com.odmytrenko.spring.service;

import com.odmytrenko.spring.dao.EventDao;
import com.odmytrenko.spring.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventDao eventDao;

    @Override
    public List<Event> getAllEvents() {
        return eventDao.getAllEvents();
    }

    @Override
    public Event addEvent(Event event) {
        return eventDao.addEvent(event);
    }

    @Override
    public List<Event> getEventsByDate(Date date) {
        return eventDao.getEventsByDate(date);
    }
}
