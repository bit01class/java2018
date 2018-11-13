create or replace procedure ex40_update
(v_sub in ex40.sub%type, v_content in ex40.content%type
, v_num in ex40.num%type, result out binary_integer)
is
begin
	update ex40 set sub=v_sub, content=v_content where num=v_num;
	result:=sql%rowcount;
end;
/