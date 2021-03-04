package isp.lab9.exercise1;

public class AlarmController implements Observer {
    @Override
    public void update(Object event) {
        sms();

    }

    public void sms() {
        System.out.println("Sending message");
    }
}
