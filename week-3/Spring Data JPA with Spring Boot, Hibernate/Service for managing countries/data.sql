-- Create the database
CREATE DATABASE IF NOT EXISTS ormlearn;
USE ormlearn;

-- Create the country table
DROP TABLE IF EXISTS country;
CREATE TABLE country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(100) NOT NULL
);

-- Insert data into country table
INSERT INTO country (co_code, co_name) VALUES 
("AF", "Afghanistan"),
("AL", "Albania"),
("DZ", "Algeria"),
("AS", "American Samoa"),
("AD", "Andorra"),
("AO", "Angola"),
("AI", "Anguilla"),
("AQ", "Antarctica"),
("AG", "Antigua and Barbuda"),
("AR", "Argentina"),
("AM", "Armenia"),
("AW", "Aruba"),
("AU", "Australia"),
("AT", "Austria"),
("AZ", "Azerbaijan"),
("BS", "Bahamas"),
("BH", "Bahrain"),
("BD", "Bangladesh"),
("BB", "Barbados"),
("BY", "Belarus"),
("BE", "Belgium"),
("BZ", "Belize"),
("BJ", "Benin"),
("BM", "Bermuda"),
("BT", "Bhutan"),
("BO", "Bolivia, Plurinational State of"),
("BQ", "Bonaire, Sint Eustatius and Saba"),
("BA", "Bosnia and Herzegovina"),
("BW", "Botswana"),
("BV", "Bouvet Island"),
("BR", "Brazil"),
("IO", "British Indian Ocean Territory");
