
-- Exercise 11


USE event_management;
-- Exercise 11: Daily New User Count
SELECT
    registration_date,
    COUNT(*) AS user_count
FROM users
WHERE registration_date >= CURDATE() - INTERVAL 7 DAY
GROUP BY registration_date;
