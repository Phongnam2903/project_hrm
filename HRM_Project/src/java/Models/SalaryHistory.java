package Models;

public class SalaryHistory {

    private int id;
    private int employeeId;
    private double basicSalary;
    private double businessSalary;
    private double otherAllowance;
    private double socialInsurance;
    private double unemploymentInsurance;
    private double unionFee;
    private double totalSalary;
    private double salaryDate;

    public SalaryHistory() {
    }

    public SalaryHistory(int id, int employeeId, double basicSalary, double businessSalary, double otherAllowance, double socialInsurance, double unemploymentInsurance, double unionFee, double totalSalary, double salaryDate) {
        this.id = id;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.businessSalary = businessSalary;
        this.otherAllowance = otherAllowance;
        this.socialInsurance = socialInsurance;
        this.unemploymentInsurance = unemploymentInsurance;
        this.unionFee = unionFee;
        this.totalSalary = totalSalary;
        this.salaryDate = salaryDate;
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

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public double getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(double salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public String toString() {
        return "SalaryHistory{" + "id=" + id + ", employeeId=" + employeeId + ", basicSalary=" + basicSalary + ", businessSalary=" + businessSalary + ", otherAllowance=" + otherAllowance + ", socialInsurance=" + socialInsurance + ", unemploymentInsurance=" + unemploymentInsurance + ", unionFee=" + unionFee + ", totalSalary=" + totalSalary + ", salaryDate=" + salaryDate + '}';
    }

}
