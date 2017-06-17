package com.prukacz.damian.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;

    @Column(name = "arrivalDate")
    @NotBlank(message = "Arrival date can't be empty")
    @Pattern(regexp = "[0-9]{2}(/|-)[0-9]{2}(/|-)[0-9]{4}", message = "Invalid arrival date")
    private String arrivalDate;

    @Column(name = "departureDate")
    @NotBlank(message = "Arrival date can't be empty")
    @Pattern(regexp = "[0-9]{2}(/|-)[0-9]{2}(/|-)[0-9]{4}", message = "Invalid daparture date")
    private String departureDate;

    @Column(name = "roomNumber")
    @NotBlank(message = "Room number field can't be empty")
    private int roomNumber;

    @Column(name = "clientId")
    @NotBlank(message = "ClientId field can't be empty")
    private int clientId;

    @Column(name = "extraBed")
    @NotBlank(message = "Extra bed field can't be empty")
    private boolean extraBed;

    @Column(name = "forDisabled")
    @NotBlank(message = "For disabled field can't be empty")
    private boolean forDisabled;

    @Column(name = "parking")
    @NotBlank(message = "Parking field can't be empty")
    private boolean parking;

    @Column(name = "fullBoard")
    @NotBlank(message = "Full board field can't be empty")
    private boolean fullBoard;

    @Column(name = "roomService")
    @NotBlank(message = "Room service field can't be empty")
    private boolean roomService;

    @Column(name = "paymentMethod")
    @NotBlank(message = "Payment method field can't be empty")
    @Pattern(regexp = "(Cash|Card)", message = "Invalid payment method")
    private String paymentMethod;
}
