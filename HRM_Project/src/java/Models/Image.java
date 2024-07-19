/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author xuxum
 */
public class Image {

    private int id;
    private int employeeId;
    private String imagePath;

    public Image() {
    }

    public Image(int id, int employeeId, String imagePath) {
        this.id = id;
        this.employeeId = employeeId;
        this.imagePath = imagePath;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Image{" + "id=" + id + ", employeeId=" + employeeId + ", imagePath=" + imagePath + '}';
    }

}
