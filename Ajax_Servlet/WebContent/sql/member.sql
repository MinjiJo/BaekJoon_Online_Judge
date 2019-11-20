drop table member;
--1. index.jsp에서 시작 합니다.
--2. 관리자 계정 admin, 비번 1234를 만듭니다.
--3. 사용자 계정을 3개 만듭니다.

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

insert into member values('admin', '1234', 'admin', 20, '여', 'a@a.com');
insert into member values('test1', '1234', 'test1', 20, '남', 'b@b.com');
insert into member values('test2', '1234', 'test2', 20, '여', 'c@c.com');
insert into member values('test3', '1234', 'test3', 20, '남', 'd@d.com');

select * from member where id = 'admin';