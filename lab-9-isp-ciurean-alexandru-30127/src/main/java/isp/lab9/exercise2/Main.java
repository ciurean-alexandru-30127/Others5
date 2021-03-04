package isp.lab9.exercise2;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        Pressure pressure = new Pressure();
        Humidity humidity = new Humidity();

        Controller controller = new Controller();

        temperature.register(controller);
        pressure.register(controller);
        humidity.register(controller);

        temperature.readSensor();
        pressure.readSensor();
        humidity.readSensor();
    }
}
