1# Write your MySQL query statement below
2SELECT EmployeeUNI.unique_id,Employees.name
3FROM Employees
4LEFT JOIN EmployeeUNI
5    ON Employees.id = EmployeeUNI.id ;