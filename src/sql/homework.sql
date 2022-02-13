CREATE DATABASE mydatabase;
USE mydatabase;

CREATE TABLE employee(
emp_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
given_name VARCHAR(20) NOT NULL,
middle_name VARCHAR(20) NOT NULL,
surname VARCHAR(20) NOT NULL
);
CREATE TABLE department(
dep_id  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
department VARCHAR(20) NOT NULL UNIQUE
);
CREATE TABLE department_phone(
phone_id  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
phone VARCHAR(20),
department_name VARCHAR(20),
FOREIGN KEY(department_name)  REFERENCES department(department)
);
CREATE TABLE emp_position(
emp_id  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
position VARCHAR(20) NOT NULL,
FOREIGN KEY(emp_id) REFERENCES department(dep_id)
);
CREATE TABLE corporate_car(
car_id  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
car_model VARCHAR(20) UNIQUE NOT NULL,
available_car VARCHAR(5)
);
CREATE TABLE children(
child_id INT AUTO_INCREMENT
 PRIMARY KEY,
 child_name VARCHAR(50)
 NOT NULL,
 child_BD DATE
);
--
--INSERT INTO departament(departament, departament_phone)
--VALUES ('HR','095214128'),('Marketing','094235896'),
--	   ('Security', '097235789'),('Programmers', '093257896');
--
--INSERT INTO emp_position (dep_id , emp_id , position)
--VALUES ('4', '2', 'Junior'),('1','5','T.R'),('2','1','Acounter'),
--	   ('3','3','Security guard'),('4','4','Senior'),('1','6','Recruiter');
--
--INSERT INTO corporate_car ( car_model, available_car)
--VALUES ('Honda','21 235'), ('BMW', '15 PP 155'),
-- ('Honda', '34 FU 602'), ('Nissan', '21 GM 004');
--
--INSERT INTO used_cars( car_model, emp_id)
--VALUES ('1','4'),('2','6'),('3','2'),('4','3');
--
--INSERT INTO  children(emp_id, child_name, child_BD)
--VALUES ('2', 'Kim', '2008-05-08'),('2', 'Jon', '2012-08-10'),
--('4', 'Jim','2019-7-18'), ('6','Miya', '2020-4-21');
       


