
-- Exercise 19


USE event_management;
SELECT
    evt.title,
    COUNT(DISTINCT reg.registration_id) AS total_registrations,
    AVG(fdb.rating) AS average_rating
FROM events AS evt
LEFT JOIN registrations AS reg
    ON evt.event_id = reg.event_id
LEFT JOIN feedback AS fdb
    ON evt.event_id = fdb.event_id
WHERE evt.status = 'completed'
GROUP BY evt.event_id, evt.title;