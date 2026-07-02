USE covid_db;

UPDATE covid_cases
SET confirmed_cases = 120
WHERE country='India'
  AND report_date='2020-03-15';