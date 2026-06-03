
-- Exercise 3
-- List users who have not registered

USE event_management;
SELECT
    evt.title
FROM events AS evt
LEFT JOIN sessions AS ses
    ON evt.event_id = ses.event_id
WHERE ses.session_id IS NULL;
