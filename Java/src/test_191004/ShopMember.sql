drop table shopmember;

create table shopmember(
	member_id varchar2(20) primary key,
	member_pw varchar2(20) not null,
	phone char(11) not null,
	gender char(1) check(gender in ('M','F'))
);

insert into shopmember
values('hihi','1234','01011112222','M');