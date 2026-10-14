1SELECT 
2    MAX(num) AS num
3FROM (
4    SELECT num
5    FROM MyNumbers
6    GROUP BY num
7    HAVING COUNT(num) =1
8) AS temp ;