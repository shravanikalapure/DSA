# Write your MySQL query statement below
SELECT DATE_FORMAT(trans_date, '%Y-%m') AS month,
       country,
       count(id) AS trans_count,
       sum(state = 'approved') AS approved_count,
       sum(amount) AS trans_total_amount,
       sum(if(state = 'approved', amount, 0)) AS approved_total_amount
FROM Transactions
GROUP BY month, country