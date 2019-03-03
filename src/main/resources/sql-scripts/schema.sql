CREATE TABLE subject (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  subject varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE period (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  period varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE DayOfWeek (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  day varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Schoolclass (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  teacherId bigint(20) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Student (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  schoolclassId bigint(20) DEFAULT NULL,
  userId bigint(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE TimeTable (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  userId bigint(20) NOT NULL,
  periodId bigint(20) NOT NULL,
  dayOfWeekId bigint(20) NOT NULL,
  schoolyear bigint(20) NOT NULL,
  subjectId bigint(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE users (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  username varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  name varchar(255) DEFAULT NULL,
  createdAt Date DEFAULT NULL,
  updatedAt Date DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE ROLES (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE user_roles (
  id bigint(20) NOT NULL AUTO_INCREMENT, 
  user_id bigint(20) NOT NULL,
  role_id bigint(20) NOT NULL,
);
