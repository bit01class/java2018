declare
	v_cursor sys_refcursor;
	myrow ex40%rowtype;
begin
	ex40_all(v_cursor);
	
	loop
	fetch v_cursor into myrow;
	exit when v_cursor%notfound;
	dbms_output.put_line(myrow.num||','||myrow.sub);
	end loop;
end;
/