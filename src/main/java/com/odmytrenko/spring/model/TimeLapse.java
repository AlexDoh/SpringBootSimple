package com.odmytrenko.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.sql.Time;

@Embeddable
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class TimeLapse {

    @Column(name = "TIMESTART")
    @JsonProperty
    private Time timeFrom;

    @Column(name = "TIMEFINISH")
    @JsonProperty
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
