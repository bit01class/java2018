create table ex44(
	num number primary key,
	sub varchar2(30),
	content varchar2(2000),
	nalja date,
	ref number,
	ord number default 0,
	lev number default 0
);

create sequence ex44_seq;

insert into ex44 (num,sub,content,nalja,ref) 
values (ex44_seq.nextval,'test01','test',sysdate,ex44_seq.currval);

insert into ex44 (num,sub,content,nalja,ref) 
values (ex44_seq.nextval,'test02','test',sysdate,ex44_seq.currval);

insert into ex44 (num,sub,content,nalja,ref) 
values (ex44_seq.nextval,'test03','test',sysdate,ex44_seq.currval);

insert into ex44 (num,sub,content,nalja,ref) 
values (ex44_seq.nextval,'test04','test',sysdate,ex44_seq.currval);

commit;