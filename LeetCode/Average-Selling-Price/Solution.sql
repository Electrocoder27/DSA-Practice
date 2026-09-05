1SELECT 
2    p.product_id,
3    ROUND(IFNULL(SUM(p.price*u.units)/SUM(u.units),0),2) AS average_price
4FROM 
5    Prices as p
6LEFT JOIN 
7    UnitsSold AS u
8    ON p.product_id = u.product_id 
9    AND u.purchase_date BETWEEN p.start_date AND p.end_date
10GROUP BY p.product_id ;