
-- Exercise 21


USE event_management;
SELECT
    usr.full_name,
    COUNT(fdb.feedback_id) AS feedbacks_given
FROM users AS usr
JOIN feedback AS fdb
    ON usr.user_id = fdb.user_id
GROUP BY usr.user_id, usr.full_name
ORDER BY feedbacks_given DESC
LIMIT 5;