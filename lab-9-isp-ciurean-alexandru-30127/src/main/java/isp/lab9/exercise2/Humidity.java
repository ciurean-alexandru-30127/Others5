package isp.lab9.exercise2;

public class Humidity extends Observable implements ReadSensorInterface {
    double val;

    @Override
    public void readSensor() {
        val = (Math.random() * ((100)));
        this.changeState("HUMIDITY", val);
    }
}