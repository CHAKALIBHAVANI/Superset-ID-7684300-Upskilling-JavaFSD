
-- Exercise 20


USE event_management;
SELECT
    usr.full_name,
    COUNT(DISTINCT reg.event_id) AS attended_events,
    COUNT(DISTINCT fdb.feedback_id) AS feedback_count
FROM users AS usr
LEFT JOIN registrations AS reg
    ON usr.user_id = reg.user_id
LEFT JOIN feedback AS fdb
    ON usr.user_id = fdb.user_id
GROUP BY usr.user_id, usr.full_name;