package Models;

import java.sql.Date;
import java.sql.Timestamp;

public class Attendance {

    private int id;
    private int employeeId;
    private Timestamp checkInTime;
    private Timestamp checkOutTime;
    private Date workDate;

    public Attendance() {
    }

    public Attendance(int id, int employeeId, Timestamp checkInTime, Timestamp checkOutTime, Date workDate) {
        this.id = id;
        this.employeeId = employeeId;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.workDate = workDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Timestamp getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Timestamp checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Timestamp getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Timestamp checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "Attendance{" + "id=" + id + ", employeeId=" + employeeId + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", workDate=" + workDate + '}';
    }

}
