1SELECT
2    c.id,
3    c.movie,
4    c.description,
5    c.rating
6FROM Cinema AS c
7WHERE c.id%2 =1 AND c.description <> "boring"
8ORDER BY c.rating DESC ;