package com.propify.challenge.constants;

public class Validations {

    /**
     *  Validate correct email format
     * */
    public final static String EMAIL_VALIDATION_PROPERTY = "/^w+[+.w-]*@([w-]+.)*w+[w-]*.([a-z]{2,4}|d+)$/i" ;

    /**
     *  Validate numbers and capital letters in any combination until 10 characters.
     * */
    public final static String CODE_VALIDATION_PROPERTY = "^[A-Z0-9]{0,10}" ;

    /**
     *  Validate the word "UTF" in capital letters
     *  Followed by plus or minus sign
     *  And a number ranging from 0 to 9.
     * */
    public final static String TIMEZONE_VALIDATION_ADDRESS = "/\\bUTF\\b(\\-|\\+)([0-9])/g" ;

    /**
     *  Validate 5 digits
     *  Ranging from 0 to 9.
     * */
    public final static String STATE_VALIDATION_ADDRESS = "^[0-9]{5}" ;

    /**
     *  Validate 2 letters
     * */
    public final static String ZIP_VALIDATION_ADDRESS = "^[A-Za-z]{2}" ;


    // public final static String STATE_VALIDATION_ADDRESS = "" ;
}
