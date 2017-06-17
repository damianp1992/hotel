package com.prukacz.damian.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clientId;

    @Column(name = "name")
//    @NotBlank(message = "Name field can't be empty")
//    @Size(min = 2, max = 20, message = "Invalid name")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "Surname field can't be empty")
    @Size(min = 2, max = 20, message = "Invalid surname")
    private String surname;

    @Column(name = "city")
    @NotBlank(message = "City field can't be empty")
    @Size(min = 2, max = 20, message = "Invalid city")
    private String city;

    @Column(name = "age")
    @Max(value = 5)
    private int age;

    @Column(name = "gender")
    @NotBlank(message = "Name field can't be empty")
    @Size(max = 1, message = "Invalid gender")
    @Pattern(regexp = "[A-Z]", message = "Invalid gender")
    private String gender;

    @Column(name = "nationality")
    @NotBlank(message = "Surname field can't be empty")
    @Size(min = 2, max = 20, message = "Invalid nationality")
    @Pattern(regexp = "[A-Z][a-z]+", message = "Invalid nationality")
    private String nationality;

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
