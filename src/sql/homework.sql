CREATE DATABASE employees;

use employees;

CREATE TABLE `employees`.`departments` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dept_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `dept_name_UNIQUE` (`dept_name`));

  CREATE TABLE `employees`.`positions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `position_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `position_name_UNIQUE` (`position_name`));

  CREATE TABLE `employees`.`departments_positions` (
  `dept_id` INT NOT NULL,
  `position_id` INT NOT NULL,
  INDEX `dept_fk_idx` (`dept_id`),
  INDEX `postition_fk_idx` (`position_id`),
  CONSTRAINT `dept_fk`
    FOREIGN KEY (`dept_id`)
    REFERENCES `employees`.`departments` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `postition_fk`
    FOREIGN KEY (`position_id`)
    REFERENCES `employees`.`positions` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `employees`.`department_phones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `phone_number` VARCHAR(45) NOT NULL,
  `dept_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `phone_number_UNIQUE` (`phone_number`),
  INDEX `dept_name_key_idx` (`dept_id`),
  CONSTRAINT `dept_name_key`
    FOREIGN KEY (`dept_id`)
    REFERENCES `employees`.`departments` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `employees`.`employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `middle_name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `position_id` INT NOT NULL,
  `corporate_car_is_available` BOOLEAN NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `employee_position_fk_idx` (`position_id`),
  CONSTRAINT `employee_position_fk_idx`
    FOREIGN KEY (`position_id`)
    REFERENCES `employees`.`positions` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `employees`.`employee's_children` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `birth_date` DATE NOT NULL,
  `employee_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `child_employee_fk_idx` (`employee_id`),
  CONSTRAINT `child_employee_fk`
    FOREIGN KEY (`employee_id`)
    REFERENCES `employees`.`employees` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);