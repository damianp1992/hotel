package com.prukacz.damian.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;

@Data
@Entity
@Table(name = "additionalOffer")
public class AdditionalOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long offerId;

    @Column(name = "typeOfOffer")
    @NotBlank(message = "Type of offer field can't be empty")
    private String typeOfOffer;

    @Column(name = "priceOfOffer")
    @NotBlank(message = "Price of offer field can't be empty")
    private double priceOfOffer;
}
