
-- Exercise 7


USE event_management;
SELECT
    usr.full_name,
    evt.title,
    fdb.rating,
    fdb.comments
FROM feedback AS fdb
JOIN users AS usr
    ON fdb.user_id = usr.user_id
JOIN events AS evt
    ON fdb.event_id = evt.event_id
WHERE fdb.rating < 3;