-- Create database
CREATE DATABASE IF NOT EXISTS ormlearn;
USE ormlearn;

-- Create table
CREATE TABLE IF NOT EXISTS country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

-- Insert sample data
INSERT INTO country VALUES ('IN', 'India')
    ON DUPLICATE KEY UPDATE co_name='India';

INSERT INTO country VALUES ('US', 'United States of America')
    ON DUPLICATE KEY UPDATE co_name='United States of America';

INSERT INTO country VALUES ('JP', 'Japan')
    ON DUPLICATE KEY UPDATE co_name='Japan';

-- View data
SELECT * FROM country;
