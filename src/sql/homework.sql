CREATE DATABASE homework15;

USE homework15;

CREATE TABLE department(  
  dep_id      INT NOT NULL AUTO_INCREMENT,  
  name        VARCHAR(255),  
  phone       VARCHAR(255),  
  CONSTRAINT pk_department PRIMARY KEY (dep_id)     
);

CREATE TABLE job(  
  job_id     INT NOT NULL AUTO_INCREMENT,  
  name        VARCHAR(255),  
  car         VARCHAR(3), 
  CONSTRAINT pk_job PRIMARY KEY (job_id) 
);

CREATE TABLE employee(  
  emp_id      INT NOT NULL AUTO_INCREMENT,  
  name        VARCHAR(255),  
  middle_name VARCHAR(255),  
  given_name  VARCHAR(255),  
  dep_id      INT,
  job_id      INT,  

  CONSTRAINT pk_employee PRIMARY KEY (emp_id),  
  CONSTRAINT fk_dep_id FOREIGN KEY (dep_id) REFERENCES department (dep_id),
  CONSTRAINT fk_job_id FOREIGN KEY (job_id) REFERENCES job (job_id)   
);

CREATE TABLE children(  
  child_id    INT NOT NULL AUTO_INCREMENT,  
  name        VARCHAR(255),  
  birth       DATE,    
  emp_id      INT,  

  CONSTRAINT pk_children PRIMARY KEY (child_id),  
  CONSTRAINT fk_emp_id FOREIGN KEY (emp_id) REFERENCES employee (emp_id)
);






