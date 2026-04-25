# Write your MySQL query statement below
-- SELECT t1.contest_id,((count(t1.user_id)/count(t2.user_id))*100.0) as percentage from Register t1 join Users t2 on t1.user_id = t2.user_id group by t1.contest_id



SELECT t1.contest_id,ROUND((count(t1.user_id)/(Select count(user_id) from Users))*100.0,2) as percentage from Register t1 join Users t2 on t1.user_id = t2.user_id group by t1.contest_id order by percentage desc , t1.contest_id asc