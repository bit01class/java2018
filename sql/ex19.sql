declare
	v_sal  emp.sal%TYPE;
        v_update_row NUMBER;
begin
	 SELECT sal
        INTO v_sal
        FROM emp
        WHERE empno = 7788;

        -- �˻��� �����Ͱ� �������
        IF  SQL%FOUND THEN     
            DBMS_OUTPUT.PUT_LINE('�˻��� �����Ͱ� �����մϴ� : '||v_sal);
        END IF;
	
end;
/