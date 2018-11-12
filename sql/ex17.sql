declare
	i binary_integer:=1;
	v_row dept%rowtype;
begin
	
	while(i<5) loop
		select * into v_row from dept where deptno=10*i;

		dbms_output.put_line(v_row.deptno||','||v_row.dname||','||v_row.loc);
		i:=i+1;
	end loop;
end;
/