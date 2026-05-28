# Write your MySQL query statement belo 
select eu.unique_id, e.name from Employees e Left join EmployeeUNI eu on eu.id = e.id;