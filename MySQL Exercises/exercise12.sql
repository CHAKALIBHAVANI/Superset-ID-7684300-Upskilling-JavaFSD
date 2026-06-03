
-- Exercise 12


USE event_management;
SELECT
    evt.title,
    COUNT(ses.session_id) AS total_sessions
FROM events AS evt
JOIN sessions AS ses
    ON evt.event_id = ses.event_id
GROUP BY evt.event_id, evt.title
ORDER BY total_sessions DESC
LIMIT 1;