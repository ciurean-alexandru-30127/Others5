package isp.lab9.exercise3.exceptions;

public class TenantNotFoundException extends Exception {
    public TenantNotFoundException(String a) {
        System.out.println(a);
    }
}