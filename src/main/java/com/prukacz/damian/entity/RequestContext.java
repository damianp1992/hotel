package com.prukacz.damian.entity;

import lombok.Data;

@Data
public class RequestContext {

    private Client client;
    private AdditionalOffer additionalOffer;
    private Reservation reservation;
    private Room room;
    private Receptionist receptionist;
}
