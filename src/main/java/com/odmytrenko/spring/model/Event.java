package com.odmytrenko.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EVENTS")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    private Integer id;

    @Column(name = "DATE")
    @JsonProperty
    private Date date;

    @Embedded
    @JsonProperty
    private TimeLapse timeLapse;

    @Column(name = "DESCRIPTION")
    @JsonProperty
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TimeLapse getTimeLapse() {
        return timeLapse;
    }

    public void setTimeLapse(TimeLapse timeLapse) {
        this.timeLapse = timeLapse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
