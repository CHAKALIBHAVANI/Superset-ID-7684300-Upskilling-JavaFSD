
-- Exercise 13


USE event_management;
SELECT
    evt.city,
    AVG(fdb.rating) AS average_rating
FROM events AS evt
JOIN feedback AS fdb
    ON evt.event_id = fdb.event_id
GROUP BY evt.city;