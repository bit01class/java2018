-- �����ϸ� ���̺� ����
drop table ex39;

-- ���̺� ����
create table ex39(
	num number primary key,
	name varchar2(12) not null,
	sub varchar2(30) default '�������',
	content varchar2(2000),
	nalja date default sysdate,
	cnt number(6) default 0
);

-- �����ϸ� ������ ����
drop sequence ex39_seq;

-- ������ ����
create sequence ex39_seq start with 1;

-- ���� ������
insert into ex39 values (ex39_seq.nextval, 'guest','test01','test',sysdate,0);
insert into ex39 (num,name) values (ex39_seq.nextval, 'guest');
insert into ex39 (num,name,sub,content) values (ex39_seq.nextval, 'guest','test03','test');


























