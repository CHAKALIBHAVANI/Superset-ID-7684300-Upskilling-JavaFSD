-- Exercise 1
-- Display upcoming events registered by users
-- from the same city
-- we have to run ctrl,shift+p:then use SQLTool connection  then it returns output
USE event_management;

SELECT
    usr.full_name AS user_name,
    evt.title AS event_title,
    evt.city AS event_city,
    evt.start_date AS event_date
FROM users AS usr
JOIN registrations AS reg
    ON usr.user_id = reg.user_id
JOIN events AS evt
    ON reg.event_id = evt.event_id
WHERE evt.status = 'upcoming'
  AND usr.city = evt.city
ORDER BY evt.start_date;