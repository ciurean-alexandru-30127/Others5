package isp.lab9.exercise2;

public class Pressure extends Observable implements ReadSensorInterface {
    double val;

    @Override
    public void readSensor() {
        val = (Math.random() * ((100)));
        this.changeState("PRESSURE", val);
    }
}
