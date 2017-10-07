package com.odmytrenko.spring.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Time;

@Embeddable
public class TimeLapse {

    @Column(name = "TIMEFROM")
    private Time timeFrom;

    @Column(name = "TIMETO")
    private Time timeTo;

    public Time getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Time timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Time getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Time timeTo) {
        this.timeTo = timeTo;
    }
}
