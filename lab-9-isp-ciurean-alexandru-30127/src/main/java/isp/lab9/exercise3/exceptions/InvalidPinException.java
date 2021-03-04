package isp.lab9.exercise3.exceptions;
public class InvalidPinException extends Exception {
    public InvalidPinException(String c) {
        System.out.println(c);
    }

    public InvalidPinException() {
    }
}
