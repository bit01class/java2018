declare
	sal_avg number;
	v_empno emp.empno%type;
	v_sal emp.sal%type;
begin
	v_empno:=7782;

	select avg(sal) into sal_avg from emp;
	select sal into v_sal from emp where empno=v_empno;

	if (v_sal>=3000) then
		dbms_output.put_line('3000이상 받습니다');
	elsif (v_sal>=sal_avg) then
		dbms_output.put_line('평균 받습니다');
	else
		dbms_output.put_line('적게 받습니다');
	end if;
end;
/