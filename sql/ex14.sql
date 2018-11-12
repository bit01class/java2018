declare
	cnt binary_integer;
	v_dname dept.dname%type;
-- array
	type dept_table_type is table of dept.dname%type index by binary_integer;
	type dept_table_loc_type is table of dept.loc%type index by binary_integer;

	dept_dname_table dept_table_type;
	dept_loc_table dept_table_loc_type;
	i binary_integer :=0;
begin
	for cnt in 1..4 loop
		select dname,loc into dept_dname_table(i),dept_loc_table(i) from dept where deptno=10*cnt;
		i:=i+1;
	end loop;

	for cnt in REVERSE 0..3 loop
		dbms_output.put_line(dept_dname_table(cnt)||':'||dept_loc_table(cnt));
	end loop;
end;
/