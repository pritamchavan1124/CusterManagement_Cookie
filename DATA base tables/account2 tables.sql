use JDBC;

create table account2(id int auto_increment primary key ,name varchar(20),type varchar(10),balance double);
insert into account2 (name,type,balance) values ('aa','sav',1500);
insert into account2 (name,type,balance) values ('bb','sav',2500);
insert into account2 (name,type,balance) values ('pritam','current',27800);

select * from account2;

DELIMITER $$
create   procedure transfer_funds(
 in sid int ,
 in did int,
 in amt double ,
 out sbal double,
 out dbal double 
) 
begin
update accounts set bal=bal-amt where id=sid;
update accounts set bal=bal+amt where id=did;
select bal into sbal from accounts where id=sid;
select bal into dbal from accounts where id=did;
end$$
 DELIMITER ;
 
 
 
 
 DELIMITER $$
create   procedure withdraw_fund(
 in sid int ,
 in amt double ,
 out rembal double
) 
begin
update accounts set bal=bal-amt where id=sid;
select bal into rembal from accounts where id=sid;
end$$
 DELIMITER ;
 
 
