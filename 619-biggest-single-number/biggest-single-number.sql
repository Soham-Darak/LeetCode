# Write your MySQL query statement below
Select Max(num) as num from(select num from MyNumbers group by num having count(num) = 1) as temp;