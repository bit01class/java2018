create or replace procedure ex40_one
(v_num in ex40.num%type, v_cursor out sys_refcursor)
is
begin
	open v_cursor for select * from ex40 where num=v_num;
end;
/