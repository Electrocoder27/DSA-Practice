1SELECT 
2    user_id,
3    COUNT(follower_id) AS followers_count
4FROM
5    Followers
6GROUP BY user_id
7ORDER BY user_id ASC ;
8     