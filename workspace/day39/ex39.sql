-- 존재하면 테이블 삭제
drop table ex39;

-- 테이블 생성
create table ex39(
	num number primary key,
	name varchar2(12) not null,
	sub varchar2(30) default '제목없음',
	content varchar2(2000),
	nalja date default sysdate,
	cnt number(6) default 0
);

-- 존재하면 시퀀스 삭제
drop sequence ex39_seq;

-- 시퀀스 생성
create sequence ex39_seq start with 1;

-- 더미 데이터
insert into ex39 values (ex39_seq.nextval, 'guest','test01','test',sysdate,0);
insert into ex39 (num,name) values (ex39_seq.nextval, 'guest');
insert into ex39 (num,name,sub,content) values (ex39_seq.nextval, 'guest','test03','test');


























