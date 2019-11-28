drop table board;

CREATE TABLE BOARD(
	BOARD_NUM           NUMBER,			--�� ��ȣ
	BOARD_NAME          VARCHAR2(30),	--�ۼ���
	BOARD_PASS          VARCHAR2(30),	--��й�ȣ
	BOARD_SUBJECT       VARCHAR2(300),	--����
	BOARD_CONTENT		VARCHAR2(4000),	--����
	BOARD_FILE          VARCHAR2(50),	--÷�ε� ���� ��
	BOARD_RE_REF        NUMBER,			--�亯 �� �ۼ��� �����Ǵ� ���� ��ȣ
	BOARD_RE_LEV        NUMBER,			--�亯 ���� ����
	BOARD_RE_SEQ        NUMBER,			--�亯 ���� ����
	BOARD_READCOUNT 	NUMBER,			--���� ��ȸ��
	BOARD_DATE DATE,					--���� �ۼ� ��¥
	PRIMARY KEY(BOARD_NUM)
);

select * from board order by board_num;

-- board ���̺� ���纻 �����
create table board_copy5
as
select * from board;

--���� ���̺��� ������ ����
insert into board
select * from BOARD_COPY5