package com.prukacz.damian.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "receptionist")
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long receptionistId;

    @Column(name = "name")
    @NotBlank(message = "Name field can't be empty")
    @Size(min = 2, max = 20, message = "Invalid name")
    @Pattern(regexp = "[A-Z][a-z]+", message = "Invalid name")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "Surname field can't be empty")
    @Size(min = 2, max = 20, message = "Invalid surname")
    @Pattern(regexp = "[A-Z][a-z]+", message = "Invalid surname")
    private String surname;

    @Column(name = "identityCard")
    @NotBlank(message = "Identity card field can't be empty")
    @Size(min = 2, max = 20, message = "Invalid identity card")
    @Pattern(regexp = "[A-Z]{3}[0-9]{4}", message = "Invalid identity card")
    private String identityCard;

    @Column(name = "phone")
    @NotBlank(message = "Phone number field can't be empty")
    @Size(min = 8, max = 12, message = "Invalid phone number")
    @Pattern(regexp = "[0-9]+", message = "Invalid phone number")
    private String phone;

    @Column(name = "email")
    @NotBlank(message = "Email field can't be empty")
    @Size(min = 6, max = 35, message = "Invalid email")
    @Pattern(regexp = "[a-zA-Z0-9]+[.-_][a-z0-9]+@[a-z0-9]+.[a-z0-9]{1,4}", message = "Invalid email")
    private String email;

    @Column(name = "login")
    @NotBlank(message = "Login field can't be empty")
    @Size(min = 6, max = 15, message = "Invalid login")
    @Pattern(regexp = "[A-Za-z0-9]+", message = "Invalid login")
    private String login;

    @Column(name = "password")
    @NotBlank(message = "Password field can't be empty")
    @Size(max = 15, message = "Invalid password")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9\\\\s]).{6,}", message = "Invalid password")
    private String password;
}
