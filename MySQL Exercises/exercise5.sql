
-- Exercise 5


USE event_management;
SELECT
    usr.city,
    COUNT(DISTINCT reg.user_id) AS total_users
FROM users AS usr
JOIN registrations AS reg
    ON usr.user_id = reg.user_id
GROUP BY usr.city
ORDER BY total_users DESC
LIMIT 5;