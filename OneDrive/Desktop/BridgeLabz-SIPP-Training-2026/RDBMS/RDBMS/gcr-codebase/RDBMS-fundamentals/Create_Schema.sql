CREATE DATABASE covid_db;
USE covid_db;

CREATE TABLE covid_cases (
  id INT AUTO_INCREMENT PRIMARY KEY,
  country VARCHAR(100),
  report_date DATE,
  report_time VARCHAR(20),
  recoveries INT,
  deaths INT,
  confirmed_cases INT
);