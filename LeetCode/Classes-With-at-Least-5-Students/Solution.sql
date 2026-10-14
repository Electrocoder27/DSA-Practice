1SELECT 
2    class
3FROM
4    Courses AS c
5GROUP BY class 
6HAVING COUNT(student) >= 5 ;