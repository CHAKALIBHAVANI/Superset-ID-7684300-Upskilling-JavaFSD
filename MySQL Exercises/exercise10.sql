
-- Exercise 10


USE event_management;
SELECT DISTINCT
    evt.title
FROM events AS evt
JOIN registrations AS reg
    ON evt.event_id = reg.event_id
LEFT JOIN feedback AS fdb
    ON evt.event_id = fdb.event_id
WHERE fdb.feedback_id IS NULL;