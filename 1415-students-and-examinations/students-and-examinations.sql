-- # Write your MySQL query statement below
-- Select t.student_id,t.student_name,t.subject_name from (SELECT * FROM Students t1 cross join Subjects t2 ) t left join Examinations t2 on t.student_id = t2.student_id 


SELECT tab.student_id,tab.student_name,tab.subject_name,count(t2.subject_name) as attended_exams FROM (SELECT * FROM Students  t1 cross join Subjects t2 ) as tab left join Examinations t2 on tab.student_id=t2.student_id and tab.subject_name=t2.subject_name group by tab.subject_name,tab.student_id,tab.student_name order by tab.student_id,tab.subject_name asc