package org.jboss.jdf.example.ticketmonster.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Lookup table containing event categories
 *
 * @author Shane Bryzak
 */
@Entity
public class EventCategory implements Serializable {
    private static final long serialVersionUID = 2125778126462925768L;

    @Id
    @GeneratedValue
    private Long id;

    private String description;


    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}