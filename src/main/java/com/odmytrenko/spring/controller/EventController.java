package com.odmytrenko.spring.controller;

import com.odmytrenko.spring.model.Event;
import com.odmytrenko.spring.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
public class EventController {

    @Autowired
    private EventServiceImpl eventService;

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = eventService.getAllEvents();
        HttpStatus status = events != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(events, status);
    }


    @GetMapping(value = "/add")
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        Event resultEvent = eventService.addEvent(event);
        HttpStatus status = resultEvent != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(resultEvent, status);
    }

    @GetMapping(value = "/get")
    public ResponseEntity getEventByDate(@RequestBody Date date) {
        Event resultEvent = eventService.getEvent(date);
        HttpStatus status = resultEvent != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(resultEvent, status);
    }

}
