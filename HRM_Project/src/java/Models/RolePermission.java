package Models;

public class RolePermission {

    private int id;
    private String role;
    private String permission;

    public RolePermission() {
    }

    public RolePermission(int id, String role, String permission) {
        this.id = id;
        this.role = role;
        this.permission = permission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "RolePermission{" + "id=" + id + ", role=" + role + ", permission=" + permission + '}';
    }

}
