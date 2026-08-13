1# Write your MySQL query statement below
2SELECT tweet_id
3FROM Tweets
4WHERE CHAR_LENGTH(content)>15;