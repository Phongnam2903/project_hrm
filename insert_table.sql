INSERT INTO Company (name, taxCode, address, representativeName, representativeDOB, representativeIDCard, representativeAddress)
VALUES
('ABC Corp', '123456789', '123 Main St, Hanoi, Vietnam', 'Nguyen Van A', '1970-01-01', '0123456789', '123 Main St, Hanoi, Vietnam');
INSERT INTO Department (code, name, parentDepartmentId)
VALUES
('HR', 'Human Resources', NULL),
('ACC', 'Accounting', NULL),
('IT', 'Information Technology', NULL),
('MKT', 'Marketing', NULL);

INSERT INTO Employee (employeeCode, name, departmentId, position, dob, idCard, idCardIssueDate, idCardIssuePlace, currentAddress, basicSalary, businessSalary, otherAllowance, socialInsurance, unemploymentInsurance, unionFee, companyId)
VALUES
('EMP001', 'Le Thi B', 1, 'HR Manager', '1985-05-15', '0987654321', '2010-06-01', 'Hanoi', '456 Another St, Hanoi, Vietnam', 15000000, 5000000, 1000000, 300000, 200000, 100000, 1),
('EMP002', 'Tran Van C', 2, 'Accountant', '1990-08-20', '1122334455', '2012-09-01', 'Hanoi', '789 Third St, Hanoi, Vietnam', 12000000, 4000000, 800000, 250000, 150000, 80000, 1),
('EMP003', 'Pham Thi D', 3, 'Developer', '1992-11-25', '2233445566', '2015-04-15', 'Hanoi', '123 Fourth St, Hanoi, Vietnam', 18000000, 7000000, 1500000, 400000, 300000, 150000, 1);
INSERT INTO Dependent (employeeId, name, dob, relationship)
VALUES
(2, 'Nguyen Van B', '2010-10-01', 'Son'),
(3, 'Tran Thi C', '2015-07-12', 'Daughter');
INSERT INTO News (title, content, postDate, postedBy, companyId)
VALUES
('Company Annual Meeting', 'The annual meeting will be held on December 1st.', '2024-07-01', 2, 1),
('New HR Policies', 'We have updated our HR policies. Please check the HR portal for details.', '2024-06-15', 3, 1);
INSERT INTO Comment (newsId, comment, commentDate, commentedBy)
VALUES
(2, 'Looking forward to the meeting!', '2024-07-02', 2),
(3, 'Thanks for the update.', '2024-06-16', 3);
INSERT INTO Vote (newsId, voteType, votedBy)
VALUES
(2, 'like', 3),
(3, 'love', 2);
INSERT INTO LeaveRequest (employeeId, startDate, endDate, reason, status, approvedBy, approvalDate)
VALUES
(3, '2024-07-10', '2024-07-15', 'Vacation', 'Approved', 2, '2024-07-05'),
(2, '2024-07-20', '2024-07-25', 'Medical leave', 'Pending', NULL, NULL);
INSERT INTO Payroll (employeeId, basicSalary, businessSalary, otherAllowance, socialInsurance, unemploymentInsurance, unionFee, salaryDate)
VALUES
(2, 15000000, 5000000, 1000000, 300000, 200000, 100000, '2024-06-30'),
(3, 12000000, 4000000, 800000, 250000, 150000, 80000, '2024-06-30'),
(4, 18000000, 7000000, 1500000, 400000, 300000, 150000, '2024-06-30');

-- Insert roles into the Role table
INSERT INTO Role (roleName) VALUES 
('admin'),
('hr'),
('accountant'),
('manager'),
('employee'),
('communications');

-- Insert accounts with roleId references
INSERT INTO Account (email, password, roleId, employeeId)
VALUES
('phongnnhe176274@fpt.edu.vn', HASHBYTES('SHA2_256', 'admin'), 1, 4),
('hr@example.com', HASHBYTES('SHA2_256', '123'), 4, 2),
('employee@example.com', HASHBYTES('SHA2_256', '123'), 5, 3);


INSERT INTO RolePermission (role, permission)
VALUES
('admin', 'manage_company'),
('admin', 'manage_departments'),
('admin', 'manage_employees'),
('hr', 'manage_employees'),
('hr', 'manage_leave_requests'),
('accountant', 'view_payroll'),
('manager', 'view_department_employees'),
('manager', 'approve_leave_requests'),
('employee', 'view_self'),
('employee', 'request_leave'),
('communications', 'manage_news');
INSERT INTO Attendance (employeeId, checkInTime, checkOutTime, workDate)
VALUES
(2, '2024-07-01 08:30:00', '2024-07-01 17:30:00', '2024-07-01'),
(3, '2024-07-01 09:00:00', '2024-07-01 18:00:00', '2024-07-01');

