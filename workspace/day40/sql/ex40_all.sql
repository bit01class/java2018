create or replace procedure ex40_all(v_cursor out sys_refcursor)
is

begin
	open v_cursor for select * from ex40 order by num;
end;
/