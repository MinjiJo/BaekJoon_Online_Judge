drop table products;

create table products(
id				number(11),
name			varchar2(50),
modelnumber		varchar2(15),
series			varchar2(30)
);

alter table products add primary key(id);

select * from products;