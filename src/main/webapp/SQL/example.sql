CREATE DATABASE IF NOT EXISTS examplemandal
DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

use examplemandal;

CREATE TABLE IF NOT EXISTS mandal_goal(
	id VARCHAR(128),
	MG_no int,
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

CREATE TABLE IF NOT EXISTS mandal_todo(
	todo_date VARCHAR(128),
	id VARCHAR(128),
	MG01 VARCHAR(1024),
	MG02 VARCHAR(1024),
	MG03 VARCHAR(1024),
	MG04 VARCHAR(1024),
	MG05 VARCHAR(1024),
	MG06 VARCHAR(1024),
	MG07 VARCHAR(1024),
	MG08 VARCHAR(1024)
);

CREATE TABLE IF NOT EXISTS mandal_check(
	todo_date VARCHAR(128),
	id VARCHAR(128),
	MG_no int,
	goal01 VARCHAR(1024),
	goal02 VARCHAR(1024),
	goal03 VARCHAR(1024),
	goal04 VARCHAR(1024),
	goal05 VARCHAR(1024),
	goal06 VARCHAR(1024),
	goal07 VARCHAR(1024),
	goal08 VARCHAR(1024),
	MG_check int
);