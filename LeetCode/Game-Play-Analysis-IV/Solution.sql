1SELECT 
2    ROUND(COUNT(a2.player_id) / COUNT(a1.player_id), 2) AS fraction
3FROM (
4    -- Step 1: Find the very first login date for every player
5    SELECT player_id, MIN(event_date) AS first_login
6    FROM Activity
7    GROUP BY player_id
8) a1
9LEFT JOIN Activity a2 
10    -- Step 2: Check if that same player logged in exactly one day later
11    ON a1.player_id = a2.player_id 
12    AND a2.event_date = DATE_ADD(a1.first_login, INTERVAL 1 DAY);