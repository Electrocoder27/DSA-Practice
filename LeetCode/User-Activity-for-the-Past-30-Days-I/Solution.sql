1SELECT 
2    activity_date as day,
3    COUNT(DISTINCT user_id) as active_users
4FROM
5    Activity
6WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27' 
7GROUP BY activity_date ;
8