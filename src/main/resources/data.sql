DROP TABLE IF EXISTS course_student;
DROP TABLE IF EXISTS course_students;
DROP TABLE IF EXISTS course;
DROP TABLE IF EXISTS instructor;
DROP TABLE IF EXISTS department;
CREATE TABLE department (
  name VARCHAR(255) NOT NULL PRIMARY KEY,
  location VARCHAR(255) NOT NULL
);


--DROP TABLE IF EXISTS course;
CREATE TABLE course (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  departmentName VARCHAR(255) NOT NULL,
  instructorID int,
  duration int,
  name VARCHAR(255) NOT NULL
--  foreign key (departmentName) references department(id)
--  foreign key (instructorID) references instructor(id)
);

DROP TABLE IF EXISTS instructor;
CREATE TABLE instructor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  departmentName VARCHAR(255) NOT NULL,
  headedBy VARCHAR(255) ,
  firstname VARCHAR(255) ,
  lastname VARCHAR(255) ,
  phone VARCHAR(255)
--  foreign key (departmentName) references department(id)
);



DROP TABLE IF EXISTS student;
CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(255) ,
  lastname VARCHAR(255) ,
  phone VARCHAR(255)
);


--DROP TABLE IF EXISTS course_student;
--CREATE TABLE course_student (
--
--  course_id int ,
--  student_id int
--);






--INSERT INTO department (name, location) VALUES
--  ( 'Computers', 'Bangalore'),
--  ( 'Agriculture', 'Bhopal');


--INSERT INTO student (firstname, lastname ,phone) VALUES
--  ( 'Rocky', 'Bhai','9899998999'),
--  ( 'Akshay', 'Kumar','981118999'),
--  ( 'Ranbir', 'Kapoor','9822208999');