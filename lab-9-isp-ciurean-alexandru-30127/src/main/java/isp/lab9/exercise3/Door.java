package isp.lab9.exercise3;

import static isp.lab9.exercise3.DoorStatus.CLOSE;

public class Door {
    DoorStatus status = CLOSE;

    public DoorStatus getStatus() {
        return status;
    }

    public void setStatus(DoorStatus status) {
        this.status = status;
    }

    public void lockDoor() {
        this.status = CLOSE;
    }

    public void unlockDoor() {
        this.status = DoorStatus.OPEN;
    }
}
