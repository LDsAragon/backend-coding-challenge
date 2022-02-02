package com.propify.challenge.entities;

import com.propify.challenge.constants.PropertyType;
import com.propify.challenge.entities.Address;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;

public class Property {

    @NotNull
    public int id; // must be null for INSERT and not null for UPDATE

    @NotNull
    public String createTime;

    @NotNull
    public PropertyType type;

    @NotNull
    @Min(1) // must be greater than 0
    @DecimalMin("2") // 2 decimal places
    @DecimalMax("2") // 2 decimal places
    public BigDecimal rentPrice;

    @NotNull // must not be null
    @Valid
    public Address address;

    @NotNull
    @Pattern(regexp = "")
    public String emailAddress; // must be a valid email address

    @NotNull // not null,
    @Pattern(regexp = "") // only uppercase letters or numbers, 10 characters
    public String code;
}
