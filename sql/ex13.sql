declare
	sal_avg number;
	v_empno emp.empno%type;
	v_sal emp.sal%type;
begin
	v_empno:=7782;

	select avg(sal) into sal_avg from emp;
	select sal into v_sal from emp where empno=v_empno;

	if (v_sal>=3000) then
		dbms_output.put_line('3000�̻� �޽��ϴ�');
	elsif (v_sal>=sal_avg) then
		dbms_output.put_line('��� �޽��ϴ�');
	else
		dbms_output.put_line('���� �޽��ϴ�');
	end if;
end;
/