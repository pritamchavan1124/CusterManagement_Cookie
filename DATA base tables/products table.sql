create database entity;
use entity;

create table Products(
    Id INT PRIMARY KEY,
    Title VARCHAR(20),
    Description VARCHAR(100),
    UnitPrice INT,
    Quantity INT
);

insert into Products values(1,"bag","school bag",500,2);
insert into Products values (1,'bag','school bag',500,2);

insert into Products values (2,'keyboard','hp keyboard',700,4);

insert into Products values (3,'mouse','wired mouse',300,8);
insert into Products values (4,'mobile','samsung mobile',15000,1);

select * from Products;

use entity;