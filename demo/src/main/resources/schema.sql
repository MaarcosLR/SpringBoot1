--Create Main Table
create table task(
	id INTEGER PRIMARY KEY,
	name VARCHAR,
	description VARCHAR,
	dueDate TIMESTAMP,
	status VARCHAR DEFAULT PENDING,
	subTaskId INTEGER,
	
)