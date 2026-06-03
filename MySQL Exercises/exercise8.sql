
-- Exercise 8


USE event_management;
SELECT
    evt.title,
    COUNT(ses.session_id) AS session_count
FROM events AS evt
LEFT JOIN sessions AS ses
    ON evt.event_id = ses.event_id
WHERE evt.status = 'upcoming'
GROUP BY evt.event_id, evt.title;