
-- Exercise 15


USE event_management;
SELECT
    s1.event_id,
    s1.title AS session_one,
    s2.title AS session_two
FROM sessions AS s1
JOIN sessions AS s2
    ON s1.event_id = s2.event_id
    AND s1.session_id < s2.session_id
WHERE s1.start_time < s2.end_time
  AND s1.end_time > s2.start_time;
