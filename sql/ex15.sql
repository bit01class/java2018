declare
	v_dept dept%ROWTYPE;
begin
	for cnt in 1..4 loop
	select * into v_dept from dept where deptno=10*cnt;

	dbms_output.put_line('�μ���ȣ:'||v_dept.deptno);
	dbms_output.put_line('�μ���:'||v_dept.dname);
	dbms_output.put_line('����:'||v_dept.loc);
	end loop;
end;
/