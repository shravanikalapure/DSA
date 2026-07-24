# Write your MySQL query statement below
SELECT m.name 
FROM Employee m
JOIN Employee e

ON m.id = e.managerId
group by m.id, m.name

having count(*) >= 5;