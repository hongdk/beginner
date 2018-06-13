package com.xclink.ch08;

public class SanjExcetion extends RuntimeException {
	
    private static final long serialVersionUID = 1277558314496007L;

    /**
     * Constructs an {@code ArithmeticException} with no detail
     * message.
     */
    public SanjExcetion() {
        super();
    }

    /**
     * Constructs an {@code ArithmeticException} with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public SanjExcetion(String s) {
        super(s);
    }

}
