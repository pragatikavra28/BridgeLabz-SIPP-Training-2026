SELECT DISTINCT country
FROM covid_deaths
WHERE country NOT IN
(
    SELECT country
    FROM covid_cases
);