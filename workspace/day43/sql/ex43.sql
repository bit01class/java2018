create table ex43(
	num number primary key,
	id varchar2(10),
	sub varchar2(30),
	content varchar(2000),
	nalja date,
	cnt number
);

create sequence ex43_seq;

insert into ex43 values (ex43_seq.nextval,'guest','test01','test',sysdate,0);
insert into ex43 values (ex43_seq.nextval,'guest','test02','test',sysdate,0);
insert into ex43 values (ex43_seq.nextval,'guest','test03','test',sysdate,0);
insert into ex43 values (ex43_seq.nextval,'guest','test04','test',sysdate,0);
commit;
