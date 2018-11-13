drop table ex40;
drop sequence ex40_seq;
create table ex40(
	num number primary key,
	name varchar2(15) not null,
	sub varchar2(30),
	content varchar2(2000),
	nalja date
);
create sequence ex40_seq;
insert into ex40 values (ex40_seq.nextval,'tester','test01','test',sysdate);
insert into ex40 values (ex40_seq.nextval,'tester','test02','test',sysdate);
insert into ex40 values (ex40_seq.nextval,'tester','test03','test',sysdate);