use JDBC;


create table tutorials(id int primary key auto_increment,
name varchar(50) unique,author varchar(30),publish_date date , visits int ,contents varchar(300),
topic_id int,
constraint fk_topics foreign key  (topic_id) references topics(id));

insert into tutorials values(default,'Spring Core','Priti','2020-1-1',10,'Explains D.I n AOP in detail',4);
insert into tutorials values(default,'Spring MVC','Rama','2020-3-4',12,'Ready Made Implementation of MVC Pattern',4);
insert into tutorials values(default,'Spring Boot','Mihir','2021-1-1',20,'Automatic Config n Support in Spring Boot',4);

select * from tutorials;