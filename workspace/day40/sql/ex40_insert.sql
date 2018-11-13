create or replace procedure ex40_insert 
(v_name ex40.name%type, v_sub ex40.sub%type, v_content ex40.content%type)
is
begin
insert into ex40 values (ex40_seq.nextval, v_name, v_sub, v_content, sysdate);
commit;
end;
/