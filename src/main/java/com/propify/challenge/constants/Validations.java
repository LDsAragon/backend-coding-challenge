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
    public final static String ZIP_VALIDATION_ADDRESS = "^[A-Z]{2}" ;

    /**
     * Checks if leap year like 29/02/2020 or 29/02/2024
     * Valid Formats are: yyyy/mm/dd, yyyy-mm-dd or yyyy.mm.dd
     * Works properly only for: [1901 - 2099].
     * */
    public final static String DATE_VALIDATION_PROPERTY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$" ;
}
