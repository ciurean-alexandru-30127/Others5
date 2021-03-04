package isp.lab9.exercise3;

import isp.lab9.exercise3.exceptions.TenantAlreadyExistsException;

public class MainApp {
    public static void main(String[] args) {
        final DoorLockController doorLockController = new DoorLockController();

        try {
            doorLockController.addTenant("9999", "Alex");
        } catch (TenantAlreadyExistsException e) {
            System.out.println("Already exists");
        }

        MainScreen mainScreen = new MainScreen(doorLockController);
        mainScreen.setVisible(true);
    }
}
