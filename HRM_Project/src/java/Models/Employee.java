package Models;

import java.util.Date;

public class Employee {

    private int id;
    private String employeeCode;
    private String name;
    private int departmentId;
    private String position;
    private Date dob;
    private String idCard;
    private Date idCardIssueDate;
    private String idCardIssuePlace;
    private String currentAddress;
    private double basicSalary;
    private double businessSalary;
    private double otherAllowance;
    private double socialInsurance;
    private double unemploymentInsurance;
    private double unionFee;
    private int companyId;

    public Employee() {
    }

    public Employee(int id, String employeeCode, String name, int departmentId, String position, Date dob, String idCard, Date idCardIssueDate, String idCardIssuePlace, String currentAddress, double basicSalary, double businessSalary, double otherAllowance, double socialInsurance, double unemploymentInsurance, double unionFee, int companyId) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.name = name;
        this.departmentId = departmentId;
        this.position = position;
        this.dob = dob;
        this.idCard = idCard;
        this.idCardIssueDate = idCardIssueDate;
        this.idCardIssuePlace = idCardIssuePlace;
        this.currentAddress = currentAddress;
        this.basicSalary = basicSalary;
        this.businessSalary = businessSalary;
        this.otherAllowance = otherAllowance;
        this.socialInsurance = socialInsurance;
        this.unemploymentInsurance = unemploymentInsurance;
        this.unionFee = unionFee;
        this.companyId = companyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getIdCardIssueDate() {
        return idCardIssueDate;
    }

    public void setIdCardIssueDate(Date idCardIssueDate) {
        this.idCardIssueDate = idCardIssueDate;
    }

    public String getIdCardIssuePlace() {
        return idCardIssuePlace;
    }

    public void setIdCardIssuePlace(String idCardIssuePlace) {
        this.idCardIssuePlace = idCardIssuePlace;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBusinessSalary() {
        return businessSalary;
    }

    public void setBusinessSalary(double businessSalary) {
        this.businessSalary = businessSalary;
    }

    public double getOtherAllowance() {
        return otherAllowance;
    }

    public void setOtherAllowance(double otherAllowance) {
        this.otherAllowance = otherAllowance;
    }

    public double getSocialInsurance() {
        return socialInsurance;
    }

    public void setSocialInsurance(double socialInsurance) {
        this.socialInsurance = socialInsurance;
    }

    public double getUnemploymentInsurance() {
        return unemploymentInsurance;
    }

    public void setUnemploymentInsurance(double unemploymentInsurance) {
        this.unemploymentInsurance = unemploymentInsurance;
    }

    public double getUnionFee() {
        return unionFee;
    }

    public void setUnionFee(double unionFee) {
        this.unionFee = unionFee;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

}
