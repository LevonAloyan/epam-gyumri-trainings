CREATE
DATABASE `employee`;
________________________________
CREATE TABLE `employee`.`employee`
(
    `ID`               INT(11) NOT NULL AUTO_INCREMENT,
    `emp_full_name_id` INT(11) NOT NULL,
    `department_id`    INT(11),
    `emp_child_id`     INT(11),
    `position`         VARCHAR(255) NOT NULL,
    `corporate_car`    BOOLEAN      NOT NULL,
    PRIMARY KEY (`ID`)
    FOREIGN KEY (`emp_full_name_id`)
    FOREIGN KEY (`department_id`)
    FOREIGN KEY (`emp_child_id`)
);

____________________________________________
CREATE TABLE `employee`.`emp_full_name`
(
    `Id`          INT(11) NOT NULL AUTO_INCREMENT,
    `surname`     VARCHAR(255) NOT NULL,
    `middle_name` VARCHAR(255) NOT NULL,
    `given_name`  VARCHAR(255) NOT NULL,
    PRIMARY KEY (`Id`)
);
______________________________________________
CREATE TABLE `employee`.`emp_child`
(
    `Id`        INT(11) NOT NULL AUTO_INCREMENT,
    `name`      VARCHAR(255) NOT NULL,
    `birthdate` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`Id`)
);
_______________________________________________
CREATE TABLE `employee`.`department`
(
    `Id`    INT(11) NOT NULL AUTO_INCREMENT,
    `name`  VARCHAR(255) NOT NULL,
    `phone` INT(11) NOT NULL,
    PRIMARY KEY (`Id`)
);