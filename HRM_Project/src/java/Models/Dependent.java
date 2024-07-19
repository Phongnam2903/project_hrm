package Models;

import java.util.Date;

public class Dependent {

    private int id;
    private int employeeId;
    private String name;
    private Date dob;
    private String relationship;

    public Dependent() {
    }

    public Dependent(int id, int employeeId, String name, Date dob, String relationship) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.dob = dob;
        this.relationship = relationship;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Dependent{" + "id=" + id + ", employeeId=" + employeeId + ", name=" + name + ", dob=" + dob + ", relationship=" + relationship + '}';
    }

}
