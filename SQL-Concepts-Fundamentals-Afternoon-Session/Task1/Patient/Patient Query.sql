Use hospital_management_system;

#Patient table

create table patient(
patient_id int NOT NULL,
patient_name varchar(255) NOT NULL,
patient_age int,
patient_address varchar(255) NOT NULL,
patient_phone bigint NOT NULL,
admit_date date NOT NULL,
discharge_date date ,
doc_id int,
PRIMARY KEY (patient_id),
FOREIGN KEY ( doc_id) REFERENCES doctor(id)
);


insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
1, 'A', 20, 'Karnal', 9897456780, '2020-08-10', '2020-08-13', 3
);
insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
2, 'B', 25, 'Panipat', 9812006780, '2020-08-05', '2020-08-15', 2
);
insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
3, 'C', 30, 'Rohtak', 9897016380, '2020-08-14', '2020-08-16', 1
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
4, 'D', 10, 'Delhi', 9890056712, '2020-08-13', '2020-08-16', 9
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
5, 'E', 65, 'Yamuna Nagar', 8887116780, '2020-06-13', '2020-08-17', 4
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
6, 'F', 43, 'Chandigarh', 8899110080, '2020-08-14', '2020-08-15', 9
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
7, 'G', 33, 'Panipat', 8799110080, '2020-08-12', '2020-08-15', 4
);
insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
8, 'H', 29, 'Ambala', 8788110080, '2020-08-12', '2020-08-16', 1
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
9, 'I', 39, 'Gurugram', 8700110080, '2020-08-14', '2020-08-15', 1
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
10, 'J', 10, 'Panipat', 8799198980, '2020-07-8', '2020-07-15', 9
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
11, 'K', 38, 'Karnal', 8799110123, '2020-06-9', '2020-07-1', 3
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, doc_id
) values(
12, 'L', 36, 'Faridabad', 8799000123, '2020-06-9',  3
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
13, 'M', 33, 'Karnal', 8799110728, '2020-06-19', '2020-08-14', 1
);


insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, doc_id
) values(
14, 'N', 27, 'Faridabad', 8799000003, '2020-08-17',  3
);

insert into patient(
patient_id, patient_name, patient_age, 
patient_address, patient_phone, admit_date, discharge_date, doc_id
) values(
15, 'O', 37, 'Karnal', 8799430663, '2020-07-14', '2020-07-18', 9
);

