INSERT INTO SUBJECT (id,subject) VALUES (1,'Mathe');
INSERT INTO SUBJECT (id,subject) VALUES (2,'Deutsch');
INSERT INTO SUBJECT (id,subject) VALUES (3,'Englisch');
INSERT INTO SUBJECT (id,subject) VALUES (4,'Latein');
INSERT INTO SUBJECT (id,subject) VALUES (5,'Sport');
INSERT INTO SUBJECT (id,subject) VALUES (6,'Religion');
INSERT INTO SUBJECT (id,subject) VALUES (7,'Bildende Kunst');
INSERT INTO SUBJECT (id,subject) VALUES (8,'Chemie');
INSERT INTO SUBJECT (id,subject) VALUES (9,'Erdkunde');
INSERT INTO SUBJECT (id,subject) VALUES (10,'Informatik');

INSERT INTO DAYOFWEEK (day) VALUES ('Montag');
INSERT INTO DAYOFWEEK (day) VALUES ('Dienstag');
INSERT INTO DAYOFWEEK (day) VALUES ('Mittwoch');
INSERT INTO DAYOFWEEK (day) VALUES ('Donnerstag');
INSERT INTO DAYOFWEEK (day) VALUES ('Freitag');
INSERT INTO DAYOFWEEK (day) VALUES ('Samstag');
INSERT INTO DAYOFWEEK (day) VALUES ('Sonntag');

INSERT INTO PERIOD (period) VALUES ('1');
INSERT INTO PERIOD (period) VALUES ('2');
INSERT INTO PERIOD (period) VALUES ('3');
INSERT INTO PERIOD (period) VALUES ('4');
INSERT INTO PERIOD (period) VALUES ('5');
INSERT INTO PERIOD (period) VALUES ('6');
INSERT INTO PERIOD (period) VALUES ('7');
INSERT INTO PERIOD (period) VALUES ('8');
INSERT INTO PERIOD (period) VALUES ('9');
INSERT INTO PERIOD (period) VALUES ('10');

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

INSERT INTO users (username,password,email,name) 
VALUES('admin','821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a','admin@admin.de','Müller');
INSERT INTO users (username,password,email,name) 
VALUES('employee','821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a','employee@employee.de','Müller');
INSERT INTO users (username,password,email,name) 
VALUES('student1','821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a','student1@student.de','Müller');
INSERT INTO users (username,password,email,name) 
VALUES('student2','821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a','student2@student.de','Müller');

INSERT INTO SCHOOLCLASS(id,name,teacherId) VALUES(1,'4A',2);

INSERT INTO STUDENT (id,userId,schoolclassId) VALUES(1,3,1);
INSERT INTO STUDENT (id,userId,schoolclassId) VALUES(2,4,1);