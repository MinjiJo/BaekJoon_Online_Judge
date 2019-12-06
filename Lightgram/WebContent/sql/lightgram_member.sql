drop table All_users;

create table All_users(
	id			varchar2(20) primary key,
	password	varchar2(20) not null,
	name		varchar2(40) default '',
	email		varchar2(40) unique not null,
	profileImg	varchar2(50)
);

create table hashTags(
	hashTag		varchar2(40) primary key,
	usingCount	Number(6)

)
create table banned(
	id		varchar2(20),
	email	varchar2(40)
)

update All_users set profileImg = 'show1.png' where id = 'show1';
insert into All_users values('admin', '1234', 'admin', 'admin@admin.com', '');
select * from tab; 
-- 전체 테이블 조회
select * from All_users;
select * from hashTags;
select * from show1_follow;
select * from show1_post;
insert into show1_follow (id) values ('show2');
insert into show1_follow (id) values ('show3');
insert into show1_follow (hashtag) values ('#여기여기');
select * from show4_post;
select * from show4_post where hashtag = '%#여기여기%' and openLevel = 1;
select * from show4_post where hashtag like '%#여기여기%' and openLevel = 1;
drop table memb1_FOLLOW;
drop table memb1_POST;
drop table SHOW1_FOLLOW;
drop table SHOW1_POST_LIKE;
drop table SHOW1_POST_REPLIED;
drop table SHOW1_POST;

delete from All_users where id = 'show3';