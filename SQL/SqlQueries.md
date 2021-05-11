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
    


