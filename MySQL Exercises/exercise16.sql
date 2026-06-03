
-- Exercise 16


USE event_management;
SELECT
    usr.user_id,
    usr.full_name
FROM users AS usr
LEFT JOIN registrations AS reg
    ON usr.user_id = reg.user_id
WHERE usr.registration_date >= CURDATE() - INTERVAL 30 DAY
  AND reg.registration_id IS NULL;