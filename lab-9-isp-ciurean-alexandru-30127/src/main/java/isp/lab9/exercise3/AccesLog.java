package isp.lab9.exercise3;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class AccesLog implements Serializable {
    private String tenantName;
    private LocalDateTime dateTime;
    private String operation;
    private DoorStatus doorStatus;
    private String errorMessage;

    public AccesLog(String tenantName, LocalDateTime dateTime, String operation, DoorStatus doorStatus, String errorMessage) {
        this.tenantName = tenantName;
        this.dateTime = dateTime;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.errorMessage = errorMessage;
    }

    public AccesLog() {

    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void setDoorStatus(DoorStatus doorStatus) {
        this.doorStatus = doorStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccesLog accesLog = (AccesLog) o;
        return Objects.equals(tenantName, accesLog.tenantName) &&
                Objects.equals(dateTime, accesLog.dateTime) &&
                Objects.equals(operation, accesLog.operation) &&
                doorStatus == accesLog.doorStatus &&
                Objects.equals(errorMessage, accesLog.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantName, dateTime, operation, doorStatus, errorMessage);
    }

    @Override
    public String toString() {
        return "AccesLog{" +
                "tenantName='" + tenantName + '\'' +
                ", dateTime=" + dateTime +
                ", operation='" + operation + '\'' +
                ", doorStatus=" + doorStatus +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
