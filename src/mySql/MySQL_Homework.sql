CREATE DATABASE MySQL_Homework;

USE MySQL_Homework;

CREATE TABLE employee
(
    emp_id      INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    given_name  VARCHAR(30) NOT NULL,
    middle_name VARCHAR(30) NOT NULL,
    surname     VARCHAR(25) NOT NULL
);

CREATE TABLE department
(
    dep_id     INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    department VARCHAR(20) NOT NULL
);

CREATE TABLE department_phone
(
    phone_id        INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    phone           VARCHAR(20),
    department_name VARCHAR(30),
    FOREIGN KEY (department_name) REFERENCES department (department)
);

CREATE TABLE emp_position
(
    emp_id   INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    position VARCHAR(30) NOT NULL,
    FOREIGN KEY (emp_id) REFERENCES department (dep_id)
);

CREATE TABLE corporate
(
    cor_id    INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    cor_model VARCHAR(30) UNIQUE NOT NULL,
    cor       VARCHAR(30)
);

CREATE TABLE child
(
    child_id   INT AUTO_INCREMENT PRIMARY KEY,
    child_name VARCHAR(30),
    child      DATE
);

