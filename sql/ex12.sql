declare
	num emp.empno%type;
	-- num number(4);
	name emp.ename%type;
	-- name varchar2(10);
	dno emp.deptno%type;
begin
	num :=7369;
	select ename,deptno into name, dno from emp where empno=num;
	dbms_output.put_line(num||'사번의 부서는 '||dno||' 이름은 '||name);
end;
/