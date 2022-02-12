CREATE DATABASE staff; 
USE staff;
CREATE TABLE employees(emp_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                       first_name VARCHAR(50) NOT NULL, 
				       middle_name  VARCHAR(50) NOT NULL, 
                       given_name  VARCHAR(50) NOT NULL);
 
CREATE TABLE departments (dep_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,  
                           department VARCHAR(50) NOT NULL,
                           dep_phone INT NOT NULL);
			                           
CREATE TABLE emp_positions ( dep_id INT NOT NULL,
                            emp_id INT NOT NULL,
                            emp_position VARCHAR(60) NOT NULL,
                            FOREIGN KEY (dep_id) REFERENCES departments(dep_id),
                            FOREIGN KEY (emp_id) REFERENCES employees(emp_id));

CREATE TABLE corporate_cars (car_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
                          car_name VARCHAR(30) NOT NULL,
                          car_numbers VARCHAR(10) NOT NULL);
                          
CREATE TABLE used_cars( used_cars_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
						car_id INT NOT NULL,
                        emp_id INT NOT NULL,
                         FOREIGN KEY (car_id) REFERENCES corporate_car(car_id),
						 FOREIGN KEY (emp_id) REFERENCES employees(emp_id));
							                         
CREATE TABLE employees_children (emp_id INT NOT NULL,
								child_name  VARCHAR(50) NOT NULL,
                                child_BD DATE NOT NULL,
                                FOREIGN KEY (emp_id) REFERENCES employees(emp_id));

INSERT INTO departments (department, dep_phone) 
VALUES ('HR','095214128'),('Marketing','094235896'),
	   ('Security', '097235789'),('Programmers', '093257896');
       
INSERT INTO emp_positions (dep_id , emp_id , emp_position)
VALUES ('4', '2', 'Junior'),('1','5','T.R'),('2','1','Acounter'), 
	   ('3','3','Security guard'),('4','4','Senior'),('1','6','Recruiter');
       
INSERT INTO corporate_cars ( car_name, car_numbers) 
VALUES ('Honda','21 235'), ('BMW', '15 PP 155'),
 ('Honda', '34 FU 602'), ('Nissan', '21 GM 004');
       
INSERT INTO used_cars( car_id, emp_id) 
VALUES ('1','4'),('2','6'),('3','2'),('4','3');
       
INSERT INTO  employees_children(emp_id, child_name, child_BD) 
VALUES ('2', 'Kim', '2008-05-08'),('2', 'Jon', '2012-08-10'),
('4', 'Jim','2019-7-18'), ('6','Miya', '2020-4-21');
