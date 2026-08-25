1# Write your MySQL query statement below
2SELECT a1.machine_id ,
3ROUND(AVG(a1.timestamp-a2.timestamp),3) AS processing_time
4FROM Activity a1
5JOIN Activity a2
6ON a1.machine_id = a2.machine_id
7AND a1.process_id = a2.process_id
8AND a1.activity_type ='end'
9AND a2.activity_type = 'start'
10Group by a1.machine_id ;