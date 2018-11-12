declare
	v_sal  emp.sal%TYPE;
        v_update_row NUMBER;
begin
	 SELECT sal
        INTO v_sal
        FROM emp
        WHERE empno = 7788;

        -- 검색된 데이터가 있을경우
        IF  SQL%FOUND THEN     
            DBMS_OUTPUT.PUT_LINE('검색한 데이터가 존재합니다 : '||v_sal);
        END IF;
	
end;
/