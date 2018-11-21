drop table bbs05;
drop sequence bbs05_seq;

create table bbs05(
	num number primary key,
	name varchar2(12),
	sub varchar2(30),
	content varchar2(2000),
	nalja date
);

create sequence bbs05_seq;

insert into bbs05 values (bbs05_seq.nextval,'tester','test01','test',sysdate);
insert into bbs05 values (bbs05_seq.nextval,'tester','test02','test',sysdate);
insert into bbs05 values (bbs05_seq.nextval,'tester','test03','test',sysdate);
insert into bbs05 values (bbs05_seq.nextval,'tester','test04','test',sysdate);
insert into bbs05 values (bbs05_seq.nextval,'tester','test05','test',sysdate);
commit;
