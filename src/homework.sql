show databases ;
use epam;
create table Employee (id int not null auto_increment primary key, name varchar(255) not null ,
                       surname varchar(255) not null, middle_name varchar(255),
                       given_name varchar(255), position varchar(255),
                       corp_car enum('Yes', 'No'), dep_id int not null );

create table dep (id int not null auto_increment primary key, dep_name varchar(255) not null ,
                  dep_phone varchar(22) );

create table children (employee_id int not null , child_name varchar(255) not null,
                       birthday date not null );

create table employee_dep (employee_id int not null, dep_id int not null );

select * from Employee;

insert into employee (name, surname, middle_name, given_name, position, corp_car, dep_id )
values ('harry', 'potter', 'good boy', 'clever', 'wizard',  'No', 6 );

insert into dep (dep_name, dep_phone) values ('hogvards', '999444555' );

select * from employee;
select *from children;

insert into children (employee_id, child_name, birthday)
values ('1', 'jon jr', '2004-01-22');

select `employee`.`surname`,Employee.name, children.child_name, children.birthday
from employee left join children on Employee.id = children.employee_id;

select employee.name,employee.surname,dep.dep_name, dep.dep_phone,employee.position,employee.corp_car
from employee join dep on Employee.id = dep.id limit 3;

update employee set corp_car = 'Yes' where Employee.id = 5;

show index from dep;

select count(*) from Employee;

select count(name) from employee where name = 'jon';

select name from employee where name = 'jon';

select avg(birthday) from children;

select name, position as position from employee;

select id as mxacId, name as ashxatox from employee;

select name from employee union select child_name from children;
