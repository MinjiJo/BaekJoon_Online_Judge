drop table hakjum;
CREATE TABLE HAKJUM(
	LOWSCORE 	NUMBER(3),
	HISCORE 	NUMBER(5, 2),
	GRADE 		VARCHAR2(3)
		CONSTRAINT HAKJUM_GRADE_PK PRIMARY KEY
);

INSERT INTO HAKJUM
VALUES(0, 59.99, 'F');

INSERT INTO HAKJUM
VALUES(60, 64.99, 'D0');

INSERT INTO HAKJUM
VALUES(65, 69.99, 'D+');

INSERT INTO HAKJUM
VALUES(70, 74.99, 'C0');

INSERT INTO HAKJUM
VALUES(75, 79.99, 'C+');

INSERT INTO HAKJUM
VALUES(80, 84.99, 'B0');

INSERT INTO HAKJUM
VALUES(85, 89.99, 'B+');

INSERT INTO HAKJUM
VALUES(90, 94.99, 'A0');

INSERT INTO HAKJUM
VALUES(95, 100, 'A+');

SELECT * FROM HAKJUM;