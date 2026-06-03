
-- Exercise 3


USE event_management;

SELECT
    usr.user_id,
    usr.full_name
FROM users AS usr
LEFT JOIN registrations AS reg
    ON usr.user_id = reg.user_id
    AND reg.registration_date >= CURDATE() - INTERVAL 90 DAY
WHERE reg.registration_id IS NULL;