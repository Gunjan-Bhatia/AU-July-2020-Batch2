use hospital_management_system;


#Doctor table

create table Doctor (
id int NOT NULL,
doc_name varchar(255) NOT NULL,
age int,
address varchar(255),
phone bigint unique,
salary int,
dept_id int NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY ( dept_id) REFERENCES department(dept_id)
);

insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
1, 'Dr. Paras', 35, 'Karnal', 9895675672, 
150000, 2
);

insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
2, 'Dr. Rajeev Gupta', 55, 'Karnal', 9895345872, 
250000, 1
);
insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
3, 'Dr. Asha', 53, 'Delhi', 9321539021, 
150000, 4
);
insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
4, 'Dr. Gunjan', 21, 'Chandigarh', 9005675672, 
350000, 4
);
insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
5, 'Dr. Sahil', 21, 'Chandigarh', 9895005672, 
250000, 4
);

insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
6, 'Dr. Shubham', 42, 'Panipat', 8877675672, 
150000, 5
);

insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
7, 'Dr. Chirag', 35, 'Faridabad', 9895688699, 
150000, 3
);

insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
8, 'Dr. Sneha', 33, 'Gurugram', 9890088699, 
140000, 1
);

insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
9, 'Dr. Riya', 35, 'Ambala', 9890011699, 
230000, 6
);

insert into doctor( 
id, doc_name, age, address, phone, salary, dept_id) 
values(
10, 'Dr. Kuldeep', 33, 'Faridabad', 989568009, 
150000, 5
);

