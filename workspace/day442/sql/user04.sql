create table user04(
	num number primary key,
	id varchar2(6),
	pw varchar2(12),
	name varchar2(12)
);

create sequence user04_seq;

insert into user04 values (user04_seq.nextval,'guest','1234','�մ�');
insert into user04 values (user04_seq.nextval,'user1','1234','����1');
insert into user04 values (user04_seq.nextval,'user2','1234','����2');

commit;