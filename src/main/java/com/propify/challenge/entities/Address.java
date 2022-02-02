package com.propify.challenge.entities;


import com.propify.challenge.constants.Validations;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

public class Address {

    @NotNull(groups = {Update.class}) // must be not null for UPDATE
    @Null(groups = {Insert.class}) // must be null for INSERT
    public int id;

    @NotBlank // must not be null or blank
    public String street;

    @NotBlank // must not be null or blank
    public String city;

    @NotBlank // must not be null or blank
    @Length(min = 2 ,max = 2) // 2-letter code
    @Pattern(regexp = Validations.STATE_VALIDATION_ADDRESS)
    public String state; //

    @NotBlank // must not be null or blank
    @Length(min = 5 ,max = 5) // 5-digit code
    @Pattern(regexp = Validations.ZIP_VALIDATION_ADDRESS)
    public String zip;

    @NotBlank // must not be null or blank
    @Pattern(regexp = Validations.TIMEZONE_VALIDATION_ADDRESS)
    public String timezone; // Must be a valid timezone
}
