#2. Design a query to provide a list of doctors, which department they belong to and patients treated by them (if any).
Use hospital_management_system;


select d.id, d.doc_name ,dep.dept_name, COUNT(patient_name) as No_of_patient_treated FROM  patient p RIGHT JOIN doctor d ON p.doc_id=d.id JOIN department dep ON 
 d.dept_id=dep.dept_id GROUP BY d.id,dep.dept_id order by d.id;
