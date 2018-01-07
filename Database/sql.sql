SET FOREIGN_KEY_CHECKS=0;
/*
DROP TABLE `Users` CASCADE;
DROP TABLE `Thread` CASCADE;
DROP TABLE `Post` CASCADE;
*/
SET FOREIGN_KEY_CHECKS=1;

CREATE TABLE `Users`(
`ID_user` INT auto_increment,
`first_name` VARCHAR(45) NOT NULL,
`last_name` VARCHAR(45) NOT NULL,
`email` VARCHAR(45) NOT NULL,
`pass` VARCHAR(45) NOT NULL,
PRIMARY KEY (`ID_user`));

CREATE TABLE `Thread`(
`ID_thread` INT auto_increment,
`subject` VARCHAR(125) NOT NULL,
`thread_created` DATETIME NOT NULL,
`user_users_id` INT NOT NULL,
PRIMARY KEY (`ID_thread`));

ALTER TABLE `Thread`
	ADD CONSTRAINT fk_thread_users foreign key
    (user_users_id) references Users(ID_user);
    
CREATE TABLE `Post`(
`ID_post` INT auto_increment,
`content` VARCHAR(1500) NOT NULL,
`thread_threads_id` INT NOT NULL,
`user_users_id` INT NOT NULL,
PRIMARY KEY (`ID_post`));

ALTER TABLE `Post`
	ADD CONSTRAINT fk_post_users foreign key
    (user_users_id) references Users(ID_user);
    
    
ALTER TABLE `Post`
	ADD CONSTRAINT fk_post_thread foreign key
    (thread_threads_id) references Thread(ID_thread);
    
    ALTER TABLE `Users` CONVERT TO CHARACTER SET utf8;
	ALTER TABLE `Post` CONVERT TO CHARACTER SET utf8;
    ALTER TABLE `Thread` CONVERT TO CHARACTER SET utf8;
    