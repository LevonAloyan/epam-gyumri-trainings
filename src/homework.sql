drop database learning;
create database learning;
use learning;
DROP TABLE IF EXISTS `authors`;
CREATE TABLE `authors` (
                           `a_id` int NOT NULL AUTO_INCREMENT,
                           `a_name` varchar(20) NOT NULL,
                           PRIMARY KEY (`a_id`)
) ;
LOCK TABLES `authors` WRITE;
INSERT INTO `authors` VALUES (1,'Donald Trump'),
                             (2,'Vladimir Putin'),
                             (3,'Jho Baiden'),
                             (4,'Dale Carnegie'),
                             (5,'Alexandr Pushkin'),
                             (6,'Lev Yashin'),
                             (7,'Isaak Nuton');
UNLOCK TABLES;

select * from authors;


DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
                         `b_id` int NOT NULL AUTO_INCREMENT,
                         `b_name` varchar(100) NOT NULL,
                         `b_year` int NOT NULL,
                         `b_quantity` int DEFAULT NULL,
                         PRIMARY KEY (`b_id`)
) ;
LOCK TABLES `books` WRITE;
INSERT INTO `books` VALUES (1,'Eugene Onegin',1985,2),
                           (2,'The Fishermen and',1990,3),
                           (3,'Foundation Empire',2000,5),
                           (4,'Programming Psychology',1998,1),
                           (5,'The C++ Programming',1996,3),
                           (6,'Course',1981,12),
                           (7,'The art',1993,7);
unlock tables;

select * from books;

DROP TABLE IF EXISTS `books_authors`;
CREATE TABLE `books_authors` (
                                 `b_id` int DEFAULT NULL,
                                 `a_id` int DEFAULT NULL
) ;
LOCK TABLES `books_authors` write;
INSERT INTO `books_authors` VALUES (1,7),(2,7),(3,2),(4,3),
                                   (4,6),(5,6),(6,5),(6,4),(7,1);
unlock tables ;
select * from books_authors;

DROP TABLE if exists `books_genres`;
CREATE TABLE `books_genres` (
                                `b_id` int DEFAULT NULL,
                                `g_id` int DEFAULT NULL
);
LOCK TABLES `books_genres` write;
INSERT INTO `books_genres` VALUES (1,1),(1,5),(2,1),(2,5),(3,6),(4,2),
                                  (4,3),(5,2),(6,5),(7,2),(7,5);

unlock tables;
select  * from books_genres;
DROP TABLE IF EXISTS `genres`;
CREATE TABLE `genres` (
                          `g_id` int NOT NULL AUTO_INCREMENT,
                          `g_name` varchar(20) NOT NULL,
                          PRIMARY KEY (`g_id`)
);
LOCK TABLES `genres` WRITE ;
INSERT INTO `genres` VALUES (1,'Poetry'),(2,'Xablantry'),
                            (3,'Psychology'),(4,'Sciense'),
                            (5,'Classic'),(6,'Sciense fiction');
unlock tables;
select * from genres;

DROP TABLE IF EXISTS `subscribers`;
CREATE TABLE `subscribers` (
                               `s_id` int NOT NULL AUTO_INCREMENT,
                               `s_name` varchar(20) NOT NULL,
                               PRIMARY KEY (`s_id`)
) ;
LOCK TABLES `subscribers`WRITE ;
INSERT INTO `subscribers` VALUES (1,'Ivanov II'),(2,'Petrov BB'),(3,'Sidorov SS'),(4,'Sidorov SS');
unlock tables ;
select * from subscribers;

DROP TABLE IF EXISTS `subscriptions`;
CREATE TABLE `subscriptions` (
                                 `sb_id` int NOT NULL AUTO_INCREMENT,
                                 `sb_subscriber` varchar(20) NOT NULL,
                                 `sb_book` varchar(20) NOT NULL,
                                 `sb_start` varchar(20) NOT NULL,
                                 `sb_finish` varchar(20) NOT NULL,
                                 `sb_is_active` varchar(20) NOT NULL,
                                 PRIMARY KEY (`sb_id`)
);
LOCK TABLES `subscriptions` write ;
INSERT INTO `subscriptions` VALUES (1,'1','3','2011.11.12','2012.01.12','N'),
                                   (2,'1','1','2011.01.12','2011.02.12','N'),
                                   (3,'3','3','2012.05.17','2012.07.17','Y'),
                                   (4,'1','2','2012.06.11','2012.08.12','N'),
                                   (5,'4','1','2012.06.11','2012.07.17','Y'),
                                   (6,'1','3','2011.11.12','2012.01.12','N'),

                                (7,'1','1','2011.01.12','2011.02.12','N'),
                                   (8,'1','3','2011.11.12','2012.01.12','N'),
                                   (9,'1','1','2011.01.12','2011.02.12','N'),
                                   (10,'1','3','2011.11.12','2012.01.12','N'),
                                   (11,'1','1','2011.01.12','2011.02.12','N');
unlock tables ;
select * from subscriptions;
