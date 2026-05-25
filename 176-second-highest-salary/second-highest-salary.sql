# Write your MySQL query statement below
Select Max(salary) as SecondHighestSalary from employee where salary < (select max(salary) from employee);