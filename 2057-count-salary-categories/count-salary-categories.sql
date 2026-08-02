# Write your MySQL query statement below
-- SELECT 
--     CASE 
--         WHEN income < 20000 THEN 'Low Salary'
--         WHEN income >= 20000 AND income <= 50000 THEN 'Average Salary'
--         ELSE 'High Salary'
--     END AS category,
--     COUNT(account_id) AS accounts_count
-- FROM Accounts
-- GROUP BY 1;
SELECT 'Low Salary' AS category, COUNT(account_id) AS accounts_count
FROM Accounts
WHERE income < 20000

UNION

SELECT 'Average Salary' AS category, COUNT(account_id) AS accounts_count
FROM Accounts
WHERE income >= 20000 AND income <= 50000

UNION

SELECT 'High Salary' AS category, COUNT(account_id) AS accounts_count
FROM Accounts
WHERE income > 50000;
