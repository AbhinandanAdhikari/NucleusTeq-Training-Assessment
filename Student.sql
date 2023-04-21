CREATE DATABASE StudentDB;

USE StudentDB;

CREATE TABLE Student(
	Id INT auto_increment Primary key,
    Name VARCHAR(30),
    DOB VARCHAR(8),
    Email VARCHAR(30),
    Gender ENUM('M','F'),
    Phone_No VARCHAR(10)
);

CREATE TABLE Course1(
	Course_ID VARCHAR(3) PRIMARY KEY,
    Course_Name VARCHAR(30),
    Course_Dept VARCHAR(30)
);

CREATE TABLE Course2(
	Course_ID VARCHAR(3) PRIMARY KEY,
    Course_Name VARCHAR(30),
    Course_Dept VARCHAR(30)
);

CREATE TABLE Teacher(
	ID INT primary key,
    Name VARCHAR(30),
    Salary INT,
    Phone_No VARCHAR(10)
);

ALTER TABLE Student ADD COLUMN Course_ID VARCHAR(3) ;

ALTER TABLE Student
ADD CONSTRAINT FK_Student
foreign key(Course_ID) REFERENCES Course1(Course_ID);

ALTER TABLE Course1 ADD COLUMN Teacher_ID INT;

ALTER TABLE Course1 
ADD constraint FK_Course1
foreign key(Teacher_ID) REFERENCES Teacher(ID);

ALTER TABLE TEACHER ADD COLUMN Course_ID VARCHAR(3);
ALTER TABLE Teacher
ADD CONSTRAINT FK_Teacher
FOREIGN KEY(Course_ID) references Course1(Course_ID);

DESCRIBE Student;
DESCRIBE Teacher;
DESCRIBE Course1;

INSERT INTO Student(Id, Name, DOB, Email, Gender,Phone_No,Course_ID) VALUES
	(1,'Abhinandan Adhikari','31-07-02','abc@gmail.com','M','7828565665','C01'),
    (2, 'Raj Adhikari','01-05-92','abc@outlook.com','M','1234567891','C02'),
    (3, 'Bob Adhikari','02-05-90','abc@live.com','M','7828656556','C03'),
    (4, 'Tushar Dhruw','22-05-02','tushar.dhruw@gmail.com','M','9300565656','C01'),
    (5, 'Saurabh Kansara','11-03-02','saurabh.kansara@gmail.com','M','7800565665','C05');

SELECT * FROM Student;

INSERT INTO Course1(Course_ID, Course_Name, Course_DEPT, Teacher_ID) VALUES
	('C01','Data Stuructes & Algorithm', 'CSE',null),
    ('C02','Accounts','Commerce', null),
    ('C03','JAVA','CSE',null),
    ('C04','EEE','ETC',null),
    ('C05','AI-ML','CS',null);

INSERT INTO Course2(Course_ID, Course_Name, Course_DEPT) VALUES
	('D01','Operating System', 'CSE'),
    ('D02','Python','CSE'),
    ('D03','JAVA','CSE'),
    ('D04','C++','ETC'),
    ('C05','AI-ML','CS');
    
SELECT * FROM Course1;

INSERT INTO Teacher(ID, Name, Salary, Phone_No, Course_ID) VALUES
	(1,'P. Sharma',25000,'9300565656',null),
    (2,'J. Patra',45000,'9300565565',null),
    (3,'S. Samal', 40000, '9300565656', null);

UPDATE Course1 SET Teacher_ID = 2 WHERE Course_ID = 'C01';
UPDATE Course1 SET Teacher_ID = 1 WHERE Course_ID = 'C02';
UPDATE Course1 SET Teacher_ID = 2 WHERE Course_ID = 'C03';
UPDATE Course1 SET Teacher_ID = 1 WHERE Course_ID = 'C04';
UPDATE Course1 SET Teacher_ID = 3 WHERE Course_ID = 'C05';

Alter Table Course1
Drop foreign key FK_Course1;

Alter Table Course1
Drop Column Teacher_ID;

UPDATE Teacher set Course_ID = 'C02' where ID = 1;
UPDATE Teacher set Course_ID = 'C01' where ID = 2;
UPDATE Teacher set Course_ID = 'C05' where ID = 3;
Select * from Teacher;

-- Join Operations
Select Student.Name,Course1.Course_Name
FROM Student left join Course1 on Student.Course_ID = Course1.Course_ID;

Select Student.Name,Course1.Course_Name
FROM Student right join Course1 on Student.Course_ID = Course1.Course_ID;

Select Student.Name,Student.email,Course1.Course_Name
FROM Student inner join Course1 on Student.Course_ID = Course1.Course_ID;

Select Teacher.name, Course1.Course_Name 
From Teacher left join Course1 on Teacher.Course_ID = Course1.Course_ID;

Select Teacher.name, Course1.Course_Name 
From Teacher right join Course1 on Teacher.Course_ID = Course1.Course_ID;
-- UNION & UNION ALL
Select * from Course1 union Select * from Course2;
Select * from Course2 union all Select * from Course2;

-- Other Function
Select Count(*) from Student;
Select Count(*) from Student where Gender='F';
Select max(Salary) from Teacher;

Select * from Teacher ORDER BY Salary DESC;

Select * From Teacher having Salary>30000;

-- Query to get 2nd highest salary: 
Select * From Teacher ORDER BY SALARY DESC LIMIT 1 OFFSET 1;

-- Make use of like:
Select * FROM Student
WHERE Name like '%Adhikari';

USE studentdb;