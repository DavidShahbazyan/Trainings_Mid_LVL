package com.synisys.trainings.mid.exceptionsAndAssertions;

/**
 * @author David.Shahbazyan
 * @since Nov 27, 2014.
 */
public class UnsupportedArgumentException extends Exception {
    static final long serialVersionUID = 1L;

    public UnsupportedArgumentException(Throwable cause) {
        super(cause);
    }

    public UnsupportedArgumentException(String message, Throwable cause) {
        super("Congrats! You've got UnsupportedArgumentException. " + message, cause);
    }

    public UnsupportedArgumentException(String message) {
        super("Congrats! You've got UnsupportedArgumentException. " + message);
    }

    public UnsupportedArgumentException() {
        super();
    }
}
