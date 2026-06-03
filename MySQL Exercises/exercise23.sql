
-- Exercise 23--


USE event_management;
SELECT
    DATE_FORMAT(registration_date,'%Y-%m') AS month_year,
    COUNT(*) AS registration_count
FROM registrations
WHERE registration_date >= CURDATE() - INTERVAL 12 MONTH
GROUP BY month_year
ORDER BY month_year;