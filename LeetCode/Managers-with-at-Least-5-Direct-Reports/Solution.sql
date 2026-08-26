1# Write your MySQL query statement below
2SELECT m.name
3FROM Employee e
4JOIN Employee m
5    ON e.managerId = m.id
6GROUP BY 
7    m.id,
8    m.name
9HAVING 
10    COUNT(e.id) >= 5 ;