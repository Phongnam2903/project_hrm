package Models;

import java.util.Date;

public class LeaveRequest {

    private int id;
    private int employeeId;
    private Date startDate;
    private Date endDate;
    private String reason;
    private String status;
    private int approvedBy;
    private Date approvalDate;

    public LeaveRequest() {
    }

    public LeaveRequest(int id, int employeeId, Date startDate, Date endDate, String reason, String status, int approvedBy, Date approvalDate) {
        this.id = id;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.status = status;
        this.approvedBy = approvedBy;
        this.approvalDate = approvalDate;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" + "id=" + id + ", employeeId=" + employeeId + ", startDate=" + startDate + ", endDate=" + endDate + ", reason=" + reason + ", status=" + status + ", approvedBy=" + approvedBy + ", approvalDate=" + approvalDate + '}';
    }

}
