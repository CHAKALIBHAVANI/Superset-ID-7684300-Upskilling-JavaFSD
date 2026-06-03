
-- Exercise 22


USE event_management;
SELECT
    user_id,
    event_id,
    COUNT(*) AS duplicate_count
FROM registrations
GROUP BY user_id, event_id
HAVING COUNT(*) > 1;
