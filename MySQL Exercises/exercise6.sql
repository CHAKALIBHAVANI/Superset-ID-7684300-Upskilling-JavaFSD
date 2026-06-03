
-- Exercise 6


USE event_management;
SELECT
    evt.title,
    COUNT(res.resource_id) AS total_resources
FROM events AS evt
LEFT JOIN resources AS res
    ON evt.event_id = res.event_id
GROUP BY evt.event_id, evt.title;