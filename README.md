# Hospital Management System
## Project Setup Guide
Welcome to Hospital Managment System to Setup this project Follow thease step.

PART-A(File Setup)

1, Downwold IntelliJ IDEA Version: 2023.1.2 from Offical website(https://www.jetbrains.com/idea/) as per your operating system.
2, Install IntelliJ IDEA as intersuction in Application.
3, Open Project in IntelliJ IDEA Version.

PART-B(Database)

1, Downwold MySQL Version: 8.0.33 from Offical website(https://dev.mysql.com/downloads/) as per your operating system.
2, Install MySQL as intersuction in Application(Please Keep Password of Your MySQL).
3, Open MySQL Workbench and Click on Localhost.
4, Apply or Run thease queries one by one in Localhost.
	>create database Hospitalmanagementsystem
	>use Hospitalmanagementsystem
	>create table login(username varchar(25), password varchar(25))
	>insert into login values('admin','12345')
	>create table patient(NAME varchar(40),FATHER_NAME varchar(40),PATIENT_ID varchar(40),GENDER varchar(40),PATIENT_PHONE varchar(40),PATIENT_ADHAR varchar(40),PATIENT_ADDRESS varchar(400),PATIENT_PINCODE varchar(40))
	>create table staff(NAME varchar(40),FATHER_NAME varchar(40),STAFF_ID varchar(40),MAIL varchar(40),STAFF_PHONE varchar(40),STAFF_ADHAR varchar(40),STAFF_ADDRESS varchar(400),STAFF_PINCODE varchar(40))
	>create table authenticate(PASSWORD varchar(25))
	>insert into authenticate value('0000')
	>create table medicine(MEDICINE_NAME varchar(40),COMPANY_NAME varchar(40),MEDICINE_UD varchar(40))
	>create table appointment(APPOINTMENT_ID varchar(40),PATIENT_NAME varchar(40),PATIENT_ID varchar(40),VACCINATED varchar(40),PATIENT_PHONE varchar(40),GENDER varchar(40),TIMEING varchar(400),DEPARTMENT varchar(40))


PART-C (Connecton)

1, To connect Project with MySQL we need jar Files.
	>mysql-connector-java-8.0.28.jar Downwold from Offical website(https://dev.mysql.com/downloads/connector/j/?os=26)
	>rs2xml.jar Downwold from Trusted Website(https://sourceforge.net/projects/finalangelsanddemons/)
2, Add these two jar files with your project as dependencies.
3, Save and Apply the all changes.
4, In "Conn" Class Change your password as per MySQL Password.

PART-D (Run)

1, Start Your Project with "Splash" Class.

















