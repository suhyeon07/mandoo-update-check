CREATE DATABASE IF NOT EXISTS mandal
DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

use mandal;

CREATE TABLE IF NOT EXISTS user(
id VARCHAR(128) PRIMARY KEY, -- "email"
jsonstr VARCHAR(1024)
);

CREATE TABLE IF NOT EXISTS community(
no INT UNSIGNED PRIMARY KEY, 
id VARCHAR(128),

jsonstr VARCHAR(8192)
);

CREATE TABLE IF NOT EXISTS friend( 
id VARCHAR(128), -- "email"
frid VARCHAR(128), -- "email“ 
INDEX idx1(id)
);

CREATE TABLE IF NOT EXISTS mandal(
	id VARCHAR(128),
	FG VARCHAR(128),
	MG01 VARCHAR(128),
	MG02 VARCHAR(128),
	MG03 VARCHAR(128),
	MG04 VARCHAR(128),
	MG05 VARCHAR(128),
	MG06 VARCHAR(128),
	MG07 VARCHAR(128),
	MG08 VARCHAR(128),
	up_date VARCHAR(128)
);

CREATE TABLE IF NOT EXISTS mandal_goal(
	id VARCHAR(128),
	MG_no VARCHAR(128),
	goal01 VARCHAR(1024),
	goal02 VARCHAR(1024),
	goal03 VARCHAR(1024),
	goal04 VARCHAR(1024),
	goal05 VARCHAR(1024),
	goal06 VARCHAR(1024),
	goal07 VARCHAR(1024),
	goal08 VARCHAR(1024),
	up_date VARCHAR(128)
);

use mandal;