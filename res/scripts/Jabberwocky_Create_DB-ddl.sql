DROP TABLE IF EXISTS student_information;
DROP TABLE IF EXISTS student_results;
DROP TABLE IF EXISTS start_options;
DROP TABLE IF EXISTS quarter_options;
DROP TABLE IF EXISTS program_options;
DROP TABLE IF EXISTS current_housing_options; 
DROP TABLE IF EXISTS region_options;
DROP TABLE IF EXISTS car_options;
DROP TABLE IF EXISTS post_grad_housing_options;
DROP TABLE IF EXISTS users_groups;
DROP TABLE IF EXISTS groups;
DROP TABLE IF EXISTS users;
 

CREATE TABLE start_options
(
	terms_of_service_id INT AUTO_INCREMENT PRIMARY KEY,
	term_of_service TEXT NOT NULL,
	add_date DATETIME NOT NULL
);


CREATE TABLE quarter_options
(
	quarter_name NVARCHAR(20) PRIMARY KEY
);


CREATE TABLE program_options
(
	program_name NVARCHAR(12) PRIMARY KEY,
	starting_salary INT NOT NULL 
);

CREATE TABLE current_housing_options
(
	housing_option NVARCHAR(50) PRIMARY KEY
);

CREATE TABLE region_options
(
	region_name NVARCHAR(30) PRIMARY KEY,
	median_gross_rent INT NOT NULL,
	median_housing_costs INT NOT NULL	
);

CREATE TABLE car_options
(
	car_option_id INT AUTO_INCREMENT PRIMARY KEY,
    car_type NVARCHAR(50) NOT NULL,
	car_quality NVARCHAR(50) NOT NULL,
	price INT,
	fuel_cost INT
);

CREATE TABLE post_grad_housing_options
(
	housing_option NVARCHAR(50) PRIMARY KEY,
	cost INT
);

CREATE TABLE student_information
( 
    username NVARCHAR(50) NOT NULL PRIMARY KEY,
    user_password NVARCHAR(50) NOT NULL,
    enrollment_quarter NVARCHAR(20) NOT NULL,
    program NVARCHAR(4) NOT NULL,
    extra_part_time TINYINT,
    extra_full_time TINYINT,
    OOP_ratio TINYINT NOT NULL,
    loan_ratio TINYINT NOT NULL,
    credit_card_debt DECIMAL(13, 2),
    medical_debt DECIMAL(13, 2),
    other_loan_debt DECIMAL(13, 2),
	current_housing NVARCHAR(30) NOT NULL,
	amount_spent_on_lunch_out_weekly DECIMAL(13,2) NOT NULL,
	amount_spent_on_dinner_out_weekly DECIMAL(13,2) NOT NULL,
	amount_spent_on_video_games_monthly DECIMAL(13,2) NOT NULL,
    preferred_region NVARCHAR(30) NOT NULL,
    preferred_car NVARCHAR(50) NOT NULL,
    preferred_housing NVARCHAR(50) NOT NULL,
    monthly_rent DECIMAL(13, 2),
    monthly_utilities DECIMAL(13, 2)
);

CREATE TABLE student_results
(
    student_username NVARCHAR(50) NOT NULL PRIMARY KEY,
    salary DECIMAL(13, 2) NOT NULL,
    fed_tax DECIMAL(13, 2) NOT NULL,
    health_insurance DECIMAL(13, 2) NOT NULL,
    misc_insurance DECIMAL(13, 2) NOT NULL,
    car_payment DECIMAL(13, 2) NOT NULL,
    mortgage DECIMAL(13, 2) NOT NULL,
    monthly_rent DECIMAL(13, 2) NOT NULL,
    monthly_utilities DECIMAL(13, 2) NOT NULL,
    total_loan_amounts DECIMAL(13, 2) NOT NULL
);

CREATE TABLE users (
	user_id   INTEGER AUTO_INCREMENT PRIMARY KEY,
	name      NVARCHAR(64) NOT NULL UNIQUE,
	password  NVARCHAR(64) NOT NULL
);

CREATE TABLE groups (
	group_id  INTEGER AUTO_INCREMENT PRIMARY KEY,
	name      NVARCHAR(64) NOT NULL
);

CREATE TABLE users_groups (
	user_id   INTEGER NOT NULL,
	group_id  INTEGER NOT NULL,
	PRIMARY KEY (user_id, group_id)
);

ALTER TABLE student_information
ADD CONSTRAINT enrollment_quarter_fk
FOREIGN KEY (enrollment_quarter)
REFERENCES quarter_options(quarter_name);

ALTER TABLE student_information
ADD CONSTRAINT program_fk
FOREIGN KEY (program)
REFERENCES program_options(program_name);

ALTER TABLE student_information
ADD CONSTRAINT current_housing_fk
FOREIGN KEY (current_housing)
REFERENCES current_housing_options(housing_option);

ALTER TABLE student_information
ADD CONSTRAINT preferred_region_fk
FOREIGN KEY (preferred_region)
REFERENCES region_options(region_name);

ALTER TABLE student_information
ADD CONSTRAINT preferred_housing_fk
FOREIGN KEY (preferred_housing)
REFERENCES post_grad_housing_options(housing_option);

ALTER TABLE student_results
ADD CONSTRAINT student_username_fk
FOREIGN KEY (student_username)
REFERENCES users(name);

ALTER TABLE users_groups 
ADD CONSTRAINT fk_users_groups_user_id
FOREIGN KEY (user_id) 
REFERENCES users (user_id);

ALTER TABLE users_groups 
ADD CONSTRAINT fk_users_groups_group_id
FOREIGN KEY (group_id) 
REFERENCES groups (group_id);

INSERT INTO start_options (term_of_service, add_date)
VALUES 
(
	'Terms and Conditions – NUBA
 
This tool provides estimations of salaries, taxes, and other expenses.  It is not intended to be used as a guarantee of salary or income amounts.  The amounts used within this tool are based on U.S. Bureau of Labor Statistics information gathered from the Occupational Employment Statistics database.  This information may be outdated or contain numbers that are higher (or lower) than the average starting salary.
 
This tool is intended solely for the use of current Neumont University students and their advisors.  Access by individuals outside of the Neumont University community is prohibited. 
 
The functionality of this tool is provided “as-is”.
 
Data entered into this tool is temporarily stored on Neumont University servers.  The user session and relevant information will kept on the server for time up to one hour after leaving the site, unless the user logs out.  No personally identifiable information is collected or stored within the tool.
 
Questions regarding the information contained in this tool may be directed to the Neumont University Career Services department. ', NOW()
);

INSERT INTO quarter_options (quarter_name)
VALUES('Fall');

INSERT INTO quarter_options (quarter_name)
VALUES('Winer');

INSERT INTO quarter_options (quarter_name)
VALUES('Spring');

INSERT INTO quarter_options (quarter_name)
VALUES('Summer');

INSERT INTO program_options (program_name, starting_salary)
VALUES('BSCS', 70946);

INSERT INTO program_options (program_name, starting_salary)
VALUES('BTOM (BSTM)', 88179);

INSERT INTO program_options (program_name, starting_salary)
VALUES('BSGD', 74664);

INSERT INTO program_options (program_name, starting_salary)
VALUES('BSWD', 74196);

INSERT INTO current_housing_options (housing_option, cost)
VALUES('Neumont University housing', 1400);

INSERT INTO current_housing_options (housing_option)
VALUES('Lives with family or friends for free');

INSERT INTO current_housing_options (housing_option)
VALUES('Renting an apartment or similar'); 

INSERT INTO region_options (region_name, median_gross_rent, median_housing_costs)
VALUES('New England', 893, 1160);

INSERT INTO region_options (region_name, median_gross_rent, median_housing_costs)
VALUES('Mid-Atlantic', 948, 1130);

INSERT INTO region_options (region_name, median_gross_rent, median_housing_costs)
VALUES('Southeast', 726, 913);

INSERT INTO region_options (region_name, median_gross_rent, median_housing_costs)
VALUES('Midwest', 682, 828);

INSERT INTO region_options (region_name, median_gross_rent, median_housing_costs)
VALUES('Mountain-plains', 694, 867);

INSERT INTO region_options (region_name, median_gross_rent, median_housing_costs)
VALUES('West', 976, 1167);

INSERT INTO car_options (car_type, car_quality, price, fuel_cost)
VALUES('New car', 'High end', 70000, 155);

INSERT INTO car_options (car_type, car_quality, price, fuel_cost)
VALUES('New car', 'Middle', 25000, 209);

INSERT INTO car_options (car_type, car_quality, price, fuel_cost)
VALUES('New car', 'Low end', 15000, 411);

INSERT INTO car_options (car_type, car_quality, price, fuel_cost)
VALUES('Used car', 'High end', 40000, 155);

INSERT INTO car_options (car_type, car_quality, price, fuel_cost)
VALUES('Used car', 'Middle', 12000, 209);

INSERT INTO car_options (car_type, car_quality, price, fuel_cost)
VALUES('Used car', 'Low end', 5000, 411);

INSERT INTO car_options (car_type, car_quality)
VALUES('Transit', 'Transit');

INSERT INTO post_grad_housing_options (housing_option)
VALUES ('Own');

INSERT INTO post_grad_housing_options (housing_option)
VALUES ('Rent');

INSERT INTO post_grad_housing_options (housing_option)
VALUES ('Live with parents');
  