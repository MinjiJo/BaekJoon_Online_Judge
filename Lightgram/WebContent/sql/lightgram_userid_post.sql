drop table post;

create table post (
	id varchar2(40)  REFERENCES All_users(id),
	itemNum number(5),
	openLevel number(1),
	pic_url varchar2(100) not null,
	dataText varchar2(4000) default '',
	posted_time date default sysdate,
	alter_time date,
	location varchar2(50),
	hashTag varchar2(100)
 );
  