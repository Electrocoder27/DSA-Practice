1SELECT
2    teacher_id,
3    COUNT( DISTINCT subject_id) as cnt
4FROM
5    Teacher
6GROUP BY teacher_id ;