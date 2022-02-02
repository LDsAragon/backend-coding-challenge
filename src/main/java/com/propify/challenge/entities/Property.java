package com.propify.challenge.entities;

import com.propify.challenge.constants.PropertyType;
import com.propify.challenge.constants.Validations;
import com.propify.challenge.entities.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;

public class Property {

    @NotNull(groups = {Update.class}) // must be not null for UPDATE
    @Null(groups = {Insert.class}) // must be null for INSERT
    public int id;

    @NotNull
    @Pattern(regexp = Validations.DATE_VALIDATION_PROPERTY)
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
    @Pattern(regexp = Validations.EMAIL_VALIDATION_PROPERTY)
    public String emailAddress; // must be a valid email address

    @NotNull // not null,
    @Pattern(regexp = Validations.CODE_VALIDATION_PROPERTY) // only uppercase letters or numbers, 10 characters
    public String code;
}
