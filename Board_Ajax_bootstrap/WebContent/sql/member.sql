drop table member;
--1. index.jsp���� ���� �մϴ�.
--2. ������ ���� admin, ��� 1234�� ����ϴ�.
--3. ����� ������ 3�� ����ϴ�.

create table member(
	id			varchar2(15),
	password	varchar2(10),
	name		varchar2(15),
	age			Number,
	gender		varchar2(5),
	email		varchar2(30),
	PRIMARY KEY(id)
);

select * from member;

insert into member values('admin','1234','������',21,'m','email@a.com');