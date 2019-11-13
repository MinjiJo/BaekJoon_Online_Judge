drop table goodsinfo;
create table goodsinfo(
	code varchar2(5) primary key,
	name varchar2(30) not null,
	price number(8) not null,
	maker varchar2(20)
);
insert into goodsinfo values('10001', '������ TV', 350000, 'LG');
insert into goodsinfo values('10002', 'DVD �÷��̾�', 250000, 'LG');
insert into goodsinfo values('10003', '������ ī�޶�', 210000, '�Ｚ');
insert into goodsinfo values('10004', '���ڻ���', 180000, '���̸���');
insert into goodsinfo values('10005', '������ ������', 400000, '�Ｚ');

select * from goodsinfo;