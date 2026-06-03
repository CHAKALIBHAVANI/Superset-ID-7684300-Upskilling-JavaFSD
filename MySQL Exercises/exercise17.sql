
-- Exercise 17


USE event_management;
SELECT
    speaker_name,
    COUNT(*) AS session_count
FROM sessions
GROUP BY speaker_name
HAVING COUNT(*) > 1;