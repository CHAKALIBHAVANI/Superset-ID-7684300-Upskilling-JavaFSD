-- ==========================================
-- Exercise 2
-- Top Rated Events
-- Identify events with highest average rating
-- considering only events with at least
-- 10 feedback submissions
-- ==========================================

USE event_management;

SELECT
    evt.title AS event_title,
    AVG(fdb.rating) AS average_rating,
    COUNT(fdb.feedback_id) AS feedback_count
FROM events AS evt
JOIN feedback AS fdb
    ON evt.event_id = fdb.event_id
GROUP BY evt.event_id, evt.title
HAVING COUNT(fdb.feedback_id) >= 10
ORDER BY average_rating DESC;

