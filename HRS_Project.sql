CREATE TABLE Company (
    id INT PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(100) NOT NULL,
    taxCode NVARCHAR(20) NOT NULL,
    address NVARCHAR(255) NOT NULL,
    representativeName NVARCHAR(100) NOT NULL,
    representativeDOB DATE NOT NULL,
    representativeIDCard NVARCHAR(20) NOT NULL,
    representativeAddress NVARCHAR(255) NOT NULL
);
CREATE TABLE Department (
    id INT PRIMARY KEY IDENTITY(1,1),
    code NVARCHAR(20) NOT NULL,
    name NVARCHAR(100) NOT NULL,
    parentDepartmentId INT NULL,
    FOREIGN KEY (parentDepartmentId) REFERENCES Department(id)
);

CREATE TABLE Employee (
    id INT PRIMARY KEY IDENTITY(1,1),
    employeeCode NVARCHAR(20) NOT NULL,
    name NVARCHAR(100) NOT NULL,
    departmentId INT NOT NULL,
    position NVARCHAR(50) NOT NULL,
    dob DATE NOT NULL,
    idCard NVARCHAR(20) NOT NULL,
    idCardIssueDate DATE NOT NULL,
    idCardIssuePlace NVARCHAR(100) NOT NULL,
    currentAddress NVARCHAR(255) NOT NULL,
    basicSalary DECIMAL(18,2) NOT NULL,
    businessSalary DECIMAL(18,2) NOT NULL,
    otherAllowance DECIMAL(18,2) NULL,
    socialInsurance DECIMAL(18,2) NOT NULL,
    unemploymentInsurance DECIMAL(18,2) NOT NULL,
    unionFee DECIMAL(18,2) NOT NULL,
    FOREIGN KEY (departmentId) REFERENCES Department(id)
);
CREATE TABLE Image (
    id INT PRIMARY KEY IDENTITY(1,1),
    employeeId INT NOT NULL,
    imagePath NVARCHAR(255) NOT NULL,
    newsId INT NOT NULL,
    FOREIGN KEY (employeeId) REFERENCES Employee(id),
    FOREIGN KEY (newsId) REFERENCES News(id)
);

CREATE TABLE Dependent (
    id INT PRIMARY KEY IDENTITY(1,1),
    employeeId INT NOT NULL,
    name NVARCHAR(100) NOT NULL,
    dob DATE NOT NULL,
    relationship NVARCHAR(50) NOT NULL,
    FOREIGN KEY (employeeId) REFERENCES Employee(id)
);
CREATE TABLE News (
    id INT PRIMARY KEY IDENTITY(1,1),
    title NVARCHAR(255) NOT NULL,
    content NVARCHAR(MAX) NOT NULL,
    postDate DATE NOT NULL,
    postedBy INT NOT NULL,
    FOREIGN KEY (postedBy) REFERENCES Employee(id)
);
CREATE TABLE Comment (
    id INT PRIMARY KEY IDENTITY(1,1),
    newsId INT NOT NULL,
    comment NVARCHAR(1000) NOT NULL,
    commentDate DATE NOT NULL,
    commentedBy INT NOT NULL,
    FOREIGN KEY (newsId) REFERENCES News(id),
    FOREIGN KEY (commentedBy) REFERENCES Employee(id)
);
CREATE TABLE Vote (
    id INT PRIMARY KEY IDENTITY(1,1),
    newsId INT NOT NULL,
    voteType NVARCHAR(10) NOT NULL, -- 'like', 'love', etc.
    votedBy INT NOT NULL,
    FOREIGN KEY (newsId) REFERENCES News(id),
    FOREIGN KEY (votedBy) REFERENCES Employee(id)
);
CREATE TABLE LeaveRequest (
    id INT PRIMARY KEY IDENTITY(1,1),
    employeeId INT NOT NULL,
    startDate DATE NOT NULL,
    endDate DATE NOT NULL,
    reason NVARCHAR(255) NOT NULL,
    status NVARCHAR(20) NOT NULL, -- 'Pending', 'Approved', 'Rejected'
    approvedBy INT NULL,
    approvalDate DATE NULL,
    FOREIGN KEY (employeeId) REFERENCES Employee(id),
    FOREIGN KEY (approvedBy) REFERENCES Employee(id)
);

CREATE TABLE Payroll (
    id INT PRIMARY KEY IDENTITY(1,1),
    employeeId INT NOT NULL,
    basicSalary DECIMAL(18,2) NOT NULL,
    businessSalary DECIMAL(18,2) NOT NULL,
    otherAllowance DECIMAL(18,2) NULL,
    socialInsurance DECIMAL(18,2) NOT NULL,
    unemploymentInsurance DECIMAL(18,2) NOT NULL,
    unionFee DECIMAL(18,2) NOT NULL,
    totalSalary AS (basicSalary + businessSalary + ISNULL(otherAllowance, 0) - socialInsurance - unemploymentInsurance - unionFee) PERSISTED,
    salaryDate DATE NOT NULL,
    FOREIGN KEY (employeeId) REFERENCES Employee(id)
);
CREATE TABLE Account (
    id INT PRIMARY KEY IDENTITY(1,1),
    email NVARCHAR(100) NOT NULL,
    password NVARCHAR(255) NOT NULL,
    roleId INT NOT NULL,
    employeeId INT NOT NULL,
    dateStart DATE,
    dateEnd DATE,
    status INT NOT NULL, -- Thêm cột status kiểu số
    FOREIGN KEY (employeeId) REFERENCES Employee(id),
    FOREIGN KEY (roleId) REFERENCES Role(id)
);

CREATE TABLE Role (
    id INT PRIMARY KEY IDENTITY(1,1),
    roleName NVARCHAR(20) NOT NULL
);
CREATE TABLE Attendance (
    id INT PRIMARY KEY IDENTITY(1,1),
    employeeId INT NOT NULL,
    checkInTime DATETIME NOT NULL,
    checkOutTime DATETIME NOT NULL,
    workDate DATE NOT NULL,
    FOREIGN KEY (employeeId) REFERENCES Employee(id)
);
CREATE TABLE SalaryHistory (
    id INT PRIMARY KEY IDENTITY(1,1),
    employeeId INT NOT NULL,
    basicSalary DECIMAL(18,2) NOT NULL,
    businessSalary DECIMAL(18,2) NOT NULL,
    otherAllowance DECIMAL(18,2) NULL,
    socialInsurance DECIMAL(18,2) NOT NULL,
    unemploymentInsurance DECIMAL(18,2) NOT NULL,
    unionFee DECIMAL(18,2) NOT NULL,
    totalSalary AS (basicSalary + businessSalary + ISNULL(otherAllowance, 0) - socialInsurance - unemploymentInsurance - unionFee) PERSISTED,
    salaryDate DATE NOT NULL,
    FOREIGN KEY (employeeId) REFERENCES Employee(id)
);
ALTER TABLE Employee
ADD companyId INT NOT NULL,
FOREIGN KEY (companyId) REFERENCES Company(id);
ALTER TABLE News
ADD companyId INT NOT NULL,
FOREIGN KEY (companyId) REFERENCES Company(id);
