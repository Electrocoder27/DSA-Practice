1# Write your MySQL query statement below
2SELECT st.student_id,
3st.student_name,
4sub.subject_name,
5COUNT(e.subject_name) AS attended_exams
6FROM Students st
7CROSS JOIN Subjects sub
8LEFT JOIN Examinations e
9    ON st.student_id = e.student_id
10    AND sub.subject_name = e.subject_name
11GROUP BY 
12    st.student_id,
13    st.student_name,
14    sub.subject_name
15ORDER BY
16    st.student_id,
17    sub.subject_name;