
-- Exercise 4


USE event_management;
SELECT
    evt.title,
    COUNT(ses.session_id) AS session_count
FROM events AS evt
JOIN sessions AS ses
    ON evt.event_id = ses.event_id
WHERE TIME(ses.start_time) BETWEEN '10:00:00' AND '12:00:00'
GROUP BY evt.event_id, evt.title;