package isp.lab9.exercise2;

public class Controller implements Observer {
    @Override
    public void update(Object event, double value) {
        System.out.println("Sensor changed!");
        System.out.println(event.toString() + " sensor has the value:" + " " + value);
    }
}
