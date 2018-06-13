package com.xclink.ch08;

public class PersonException extends Exception {
	
    private static final long serialVersionUID = 51627101833892L;

    /**
     * Constructs a {@code NullPointerException} with no detail message.
     */
    public PersonException() {
        super();
    }

    /**
     * Constructs a {@code NullPointerException} with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public PersonException(String s) {
        super(s);
    }

}
