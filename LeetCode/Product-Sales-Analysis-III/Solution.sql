1SELECT 
2    product_id,
3    year as first_year,
4    quantity,
5    price
6FROM
7    Sales
8WHERE (product_id,year)IN (
9    SELECT product_id,MIN(year)
10    FROM Sales
11    GROUP BY product_id
12);
13