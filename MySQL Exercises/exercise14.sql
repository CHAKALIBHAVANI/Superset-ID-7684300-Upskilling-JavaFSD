
-- Exercise 14


USE event_management;
SELECT
    evt.title,
    COUNT(reg.registration_id) AS total_registrations
FROM events AS evt
JOIN registrations AS reg
    ON evt.event_id = reg.event_id
GROUP BY evt.event_id, evt.title
ORDER BY total_registrations DESC
LIMIT 3;