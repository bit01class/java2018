create table stu(
	idx number primary key,
	num number(4),
	name varchar2(12),
	kor number(3) default 0,
	eng number(3) default 0,
	math number(3) default 0
);

create sequence stu_seq;