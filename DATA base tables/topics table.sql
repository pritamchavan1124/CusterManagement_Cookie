use JDBC;

create table topics(id int primary key auto_increment,name varchar(30) unique);
insert into topics values(default,'Servlets');
insert into topics values(default,'JSP');
insert into topics values(default,'JPA');
insert into topics values(default,'Spring Framework');

select * from topics;