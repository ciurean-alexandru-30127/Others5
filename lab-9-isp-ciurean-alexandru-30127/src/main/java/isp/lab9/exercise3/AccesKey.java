package isp.lab9.exercise3;

import java.util.Objects;

public class AccesKey {
    private String pin;

    public AccesKey(String pin) {
        this.pin = pin;
    }

    public AccesKey() {

    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccesKey accesKey = (AccesKey) o;
        return Objects.equals(pin, accesKey.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin);
    }
}
