
-- Exercise 9


USE event_management;
SELECT
    usr.full_name,
    evt.status,
    COUNT(evt.event_id) AS total_events
FROM users AS usr
JOIN events AS evt
    ON usr.user_id = evt.organizer_id
GROUP BY usr.full_name, evt.status;