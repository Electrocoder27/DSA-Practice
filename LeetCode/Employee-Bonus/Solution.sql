1# Write your MySQL query statement below
2SELECT e.name ,b.bonus
3FROM Employee e
4LEFT JOIN Bonus b
5ON  e.empId = b.empId
6WHERE b.bonus<1000 OR b.bonus IS NULL ;