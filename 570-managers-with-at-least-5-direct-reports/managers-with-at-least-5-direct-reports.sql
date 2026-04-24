# Write your MySQL query statement below


SELECT t2.name FROM Employee t1 join Employee t2 on t2.id = t1.managerid group by t1.managerId having count(t1.id)>=5