# Write your MySQL query statement below
SELECT t1.project_id,ROUND(AVG(t2.experience_years),2) as average_years FROM Project t1
    JOIN Employee t2
    on t1.employee_id=t2.employee_id
    group by t1.project_id;