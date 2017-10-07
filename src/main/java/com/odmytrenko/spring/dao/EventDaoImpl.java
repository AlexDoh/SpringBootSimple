package com.odmytrenko.spring.dao;

import com.odmytrenko.spring.model.Event;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class EventDaoImpl implements EventDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Event> getAllEvents() {
        return (List<Event>) this.sessionFactory.getCurrentSession().createCriteria(Event.class).list();
    }

    @Override
    public Event addEvent(Event event) {
        this.sessionFactory.getCurrentSession().save(event);
        return event;
    }

    @Override
    public List<Event> getEventsByDate(Date date) {
        String query = "from Event where date =:date";
        return (List<Event>) this.sessionFactory.getCurrentSession()
                .createQuery(query)
                .setParameter("date", date)
                .list();
    }

}
