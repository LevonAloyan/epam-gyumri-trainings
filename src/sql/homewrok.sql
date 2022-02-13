create database if not exists workplace;

use workplace;

create table if not exists employee(
id bigint primary key unique auto_increment,
given_name varchar(15) not null,
middle_name varchar(15),
surname varchar(15) not null
);

create table if not exists employee_department(
department_id int not null unique primary key,
department varchar(30) unique not null
);

create table if not exists employee_position(
position_number int auto_increment primary key,
position varchar(50) not null unique,
position_in_company varchar(20),
foreign key(position) references employee_department(department)
);

create table if not exists department_phone(
dep_phone_id int auto_increment primary key,
phone_number varchar(30) not null,
depart_id int,
foreign key(depart_id) references employee_department(department_id)
);

create table if not exists available_car (
num int auto_increment primary key,
car_model varchar(20) not null unique,
is_car_available varchar(10) default 'NO'
);

create table if not exists children(
child_id bigint primary key auto_increment unique,
child_name varchar(20),
birthday Date,
foreign key(child_id) references employee(id)
);

create table if not exists salary (
employee_salary_id bigint not null unique auto_increment primary key,
salary bigint not null,
foreign key(employee_salary_id) references employee(id)
);

insert into employee values(1, 'Alex', 'Martin', 'Dones');
insert into employee values(2, 'Jack', 'Joe', 'Lewis');
insert into employee(given_name, middle_name, surname) values('George', 'Luka', 'Roy');

insert into employee_department values(1, 'HR');
insert into employee_department values(2, 'Purchasing');
insert into employee_department values(3, 'Marketing');

insert into employee_position values(1, 'HR', 'HR director');
insert into employee_position values(2, 'Purchasing', 'Purchasing director');
insert into employee_position values(3, 'Marketing', 'intern');

insert into department_phone values(1, '+37498897838',1);
insert into department_phone values(2, '+37498889766',2);
insert into department_phone values(3, '+37465888353',3);

insert into available_car(num, car_model) values(1,'Mercedes E 320');
insert into available_car(num, car_model) values(2,'BMW');
insert into available_car(num, car_model) values(3,'Audi');

insert into children values(1, 'Andro', '2001-08-09');
insert into children values(2, 'Flora', '2002-12-03');
insert into children values(3, 'Michael', '1998-04-21');

insert into salary values(1, 3000);
insert into salary values(2, 1000);
insert into salary values(3, 1500);

select * from employee as e
join salary on e.id=salary.employee_salary_id 
join available_car on e.id=available_car.num;

update available_car
join salary on available_car.num = salary.employee_salary_id
join employee on available_car.num=employee.id set available_car.is_car_available='Yes' where salary > 2000;
 





