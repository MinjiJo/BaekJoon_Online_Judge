create table user_tab(
	user_id varchar2(20) primary key,
	user_pw varchar2(20) not null,
	user_name varchar2(20) not null,
	enrolldate date
);

insert into user_tab
values('hihi','1234','gildong','1991/04/05');

select * from user_tab;