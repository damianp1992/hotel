package com.prukacz.damian.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;

@Data
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;

    @Column(name = "roomNumber")
    private int roomNumber;

    @Column(name = "numberOfPlace")
    private int numberOfPlace;

    @Column(name = "numberOfBeds")
    private int numberOfBeds;

    @Column(name = "availabilityOfRoom")
    @NotBlank(message = "availabilityOfRoom field can't be empty")
    private boolean availabilityOfRoom;

    @Column(name = "possibilityOfAdditionalBed")
    @NotBlank(message = "possibilityOfAdditionalBed field can't be empty")
    private boolean possibilityOfAdditionalBed;

    @Column(name = "adaptationForDisabled")
    @NotBlank(message = "adaptationForDisabled field can't be empty")
    private boolean adaptationForDisabled;

    @Column(name = "pricePerNight")
    private double pricePerNight;
}
