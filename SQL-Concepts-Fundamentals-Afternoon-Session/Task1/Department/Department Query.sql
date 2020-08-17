use hospital_management_system;

#Department table

create table department(
dept_id int NOT NULL,
dept_name varchar(255) NOT NULL,
Primary KEY (dept_id)
);

insert into department ( dept_id , dept_name ) values ( 1,  'Cardiology' ) ;
insert into department ( dept_id , dept_name ) values ( 2,  'ENT' ) ;
insert into department ( dept_id , dept_name ) values ( 3,  'Orthopedics' ) ;
insert into department ( dept_id , dept_name ) values ( 4,  'Physiotherapy' ) ;
insert into department ( dept_id , dept_name ) values ( 5,  'Neurology' ) ;
insert into department ( dept_id , dept_name ) values ( 6,  'Nutrition and dietetics' ) ;