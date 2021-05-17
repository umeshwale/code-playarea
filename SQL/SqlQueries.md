# SQL Queries 

How wil you increase income of all employees by 5% in a table 

    UPDATE EMPLOYEES SET INCOME = income + (income * 5.0/100);
    
Find names of all the employees starting with A

    SELECT FIRST_NAME from EMPLOYEES where FIRST_NAME like 'A%';
    
Find Number of employees working in department 'ABC'

    SEELCT COUNT(*) FROM EMPLOYEES WHERE DEPARTMENT_NAME = 'ABC';
    
PRINT details of employees whose first name ends with 'A' and contains 6 alphabets

    SELECT * FROM EMPLOYEE WHERE FIRST_NAME LIKE '_____A'; -- There are 5 underscores before A
    
Print details of employees whose salary lies between 10000 and 50000

    SELECT * FROM EMPLOYEE WHERE SALARY BETWEEN 10000 AND 50000;
    
Fetch only the first name from FULL_NAME (Umesh Wale) column of EMPLOYEES table

    SELECT substring(FULL_NAME, 0, charindex(' ', FULL_NAME)) from EMPLOYEES;

Fetch duplicate records from table EMPLOYEE

    SELECT EMP_ID, DEPT, COUNT(*)
    FROM EMPLOYEE
    GROUP BY EMP_ID, DEPT
    HAVING COUNT(*)>1
    
Remove duplicates from table EMPLOYEE
    
    DELETE FROM EMPLOYEE 
    Where (SELECT EMP_ID, COUNT(*)
        FROM EMPLOYEE
        GROUP BY EMP_ID
        HAVING COUNT(*)>1);
        
Create empty table with same structure as some other table 

    SELECT * INTO NEW_TABLE FROM OLD_TABLE WHERE 1=0;
    
FETCH common records between 2 tables 

    SELECT * from TABLE_1
    INTERSECT 
    SELECT * FROM TABLE_2;

FETCH Employee First_Name in upper case. 

    SELECT FIRST_NAME AS UPPER (EMP_FIRST_NAME) FROM EMPLOYEE;
    
Fetch top 10 records

    SELECT TOP 10* FROM EMPLOYEE 
        ORDER BY SALARY DESC;
        
Retrieve Employee FIRST_NAME and LAST_NAME in single colum as FULL_NAME separated with space

    SELECT CONCAT (FIRST_NAME, ' ', LAST_NAME) AS 'FULL_NAME'
        FROM EMPLOYEES;
  
