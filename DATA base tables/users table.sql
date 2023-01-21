use JDBC;

create table users(userid int primary key auto_increment,custFName varchar(20),custLName varchar(20), city varchar(20),email varchar(20),password varchar(20));

insert into users(custFName,custLName,city,email,password) values ('Ram','Shinde','Pune','ram@gmail.com','ram@123');

 insert into users(custFName,custLName,city,email,password) values ('Sham','Bhange','Pune','sham@gmail.com','sham@123');

insert into users(custFName,custLName,city,email,password) values ('Seeta','Mote','Mumbai','seeta@gmail.com','seeta@123');

select * from users;