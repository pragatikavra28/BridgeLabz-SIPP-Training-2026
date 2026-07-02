USE covid_db;

ALTER TABLE covid_cases
ADD vaccination_rate DECIMAL(5,2);