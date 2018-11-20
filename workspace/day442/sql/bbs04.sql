drop table bbs04;
drop sequence bbs04_seq;

create table bbs04(
	num number primary key,
	sub varchar2(30),
	content varchar2(2000),
	nalja date,
	writer number references user04(num)
);

create sequence bbs04_seq;

insert into bbs04 values (bbs04_seq.nextval, 'test1','test', sysdate, 1);
insert into bbs04 values (bbs04_seq.nextval, 'test2','test',sysdate,(select num from user04 where id='guest'));
commit;