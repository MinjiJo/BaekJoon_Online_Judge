drop table gradecard;

create table gradecard(
	NO		NUMBER(2)
		CONSTRAINT GRADECARD_NO_PK PRIMARY KEY,
	NAME	VARCHAR2(15)
		CONSTRAINT GRADECARD_NAME_NN NOT NULL,
	KOR		NUMBER(3)
		CONSTRAINT GRADECARD_KOR_CK NOT NULL 
		CHECK(KOR BETWEEN 0 AND 100),
	MATH	NUMBER(3)
		CONSTRAINT STUDENT_MATH_CK NOT NULL 
		CHECK(MATH BETWEEN 0 AND 100),
	ENG		NUMBER(3)
		CONSTRAINT STUDENT_ENG_CK NOT NULL 
		CHECK(ENG BETWEEN 0 AND 100),
	TOT		NUMBER(5) DEFAULT 0,
	AVG		NUMBER(3),
	GRADE	VARCHAR2(3)
		CONSTRAINT GRADECARD_GRADE_FK REFERENCES GRADE(GRADE)
);

select * from gradecard;