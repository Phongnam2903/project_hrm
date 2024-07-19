package Models;

public class Department {

    private int id;
    private String code;
    private String name;
    private int parentDepartmentId;

    public Department() {
    }

    public Department(int id, String code, String name, int parentDepartmentId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.parentDepartmentId = parentDepartmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentDepartmentId() {
        return parentDepartmentId;
    }

    public void setParentDepartmentId(int parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", code=" + code + ", name=" + name + ", parentDepartmentId=" + parentDepartmentId + '}';
    }

}
