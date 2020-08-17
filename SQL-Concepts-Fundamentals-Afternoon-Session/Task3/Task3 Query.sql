#3. Query to provide the count of patients discharged per day in the last week. 
Use hospital_management_system;


select discharge_date ,COUNT(patient_name) as No_of_patient_discharged from  patient where discharge_date < curdate() and discharge_date >= curdate() -7
 GROUP BY discharge_date;
 
