
-- Exercise 24--

USE event_management;
SELECT
    evt.title,
    AVG(
        TIMESTAMPDIFF(
            MINUTE,
            ses.start_time,
            ses.end_time
        )
    ) AS average_duration_minutes
FROM events AS evt
JOIN sessions AS ses
    ON evt.event_id = ses.event_id
GROUP BY evt.event_id, evt.title;