1# Write your MySQL query statement below
2SELECT 
3    v.customer_id, 
4    COUNT(v.visit_id) AS count_no_trans
5FROM Visits v
6LEFT JOIN Transactions t 
7    ON v.visit_id = t.visit_id
8WHERE t.transaction_id IS NULL
9GROUP BY v.customer_id;