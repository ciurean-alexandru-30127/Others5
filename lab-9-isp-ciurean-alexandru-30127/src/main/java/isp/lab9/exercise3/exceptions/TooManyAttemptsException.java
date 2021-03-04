package isp.lab9.exercise3.exceptions;

public class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException(String v) {
        System.out.println(v);
    }
}
