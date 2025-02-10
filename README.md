# Animal
Java program of class name "Animal" with the help of inheritance and method overriding

FRONTEND-POC 
The following document provide the proof of concept(POC) in detail:
| Author           | Created on   | Version    | Last updated by  | Last edited on | Reviewer         |
|------------------|--------------|------------|------------------|----------------|------------------|
|Shubhanshi  | 10-02-2025   | Version 1  | Shubhanshi | 10-02-2025     | Siddharth Pawar  |


Introduction
In the OT-Microservices stack, the Frontend API is built using ReactJS and integrates with other application APIs.

Purpose
The frontend is a cross-platform ReactJS app that serves as the user interface for the OT-Microservices stack. It works on any OS with a JavaScript runtime and includes test case integration to ensure functionality.

 Hardware Pre-requisites

| Requirement      | Details                |
|------------------|------------------------|
| OS               | Ubuntu or other Linux-based OS |
| RAM              | 4 GB min.              |
| Disk Space       | 20 GB                  |
| Processor        | Dual-core recommended  |
| Network          | Port 3000 (open)        |
| Instance type    |  t2.medium             |
Pre-requisites
Dependencies	Details
REST APIs: The frontend relies on OT-Microservices APIs (Employee, Attendance, Salary) that need to be configured.
Node.js: Provides the server-side runtime for running JavaScript and building React code.
NPM: Manages and installs the app's dependencies (JavaScript libraries and tools) through the package.json file.
Steps to Install
Update Packages First step is to update the packages (instance type t2.small, volume 20GB)
    sudo apt update
    sudo apt list --upgradable
sudo  apt install make 
![image](https://github.com/user-attachments/assets/86d52f13-9658-4d14-a521-2387287a604c)

sudo apt install make-guile
![Screenshot 2025-02-10 184958](https://github.com/user-attachments/assets/b2313622-4365-4ce4-8caf-205c8909ce99)

Install Node.js and npm:-{Latest version}  
sudo apt install -y nodejs
 nvm install 14
![Screenshot 2025-02-10 185312](https://github.com/user-attachments/assets/feed4d69-1863-4cdb-bed7-6e1418a5c9ec)
![Screenshot 2025-02-10 190208](https://github.com/user-attachments/assets/5d4284d4-5dec-47ab-839b-0a4d37fd76eb)

  node -v
![Screenshot 2025-02-10 185430](https://github.com/user-attachments/assets/f4fb38d5-29d9-4061-afff-1cfcceeb8164)

npm -v
![Screenshot 2025-02-10 190345](https://github.com/user-attachments/assets/741ba182-c523-4ac9-9401-af4726f0da52)

Clone the Repository:
git clone https://github.com/OT-MICROSERVICES/frontend.git
cd frontend
![Screenshot 2025-02-10 190533](https://github.com/user-attachments/assets/8d186a2b-3102-40cc-8b5c-16225e04143c)


For building the application, we can use make command  
make build
![Screenshot 2025-02-10 190711](https://github.com/user-attachments/assets/d693cbb7-a3ab-4cd3-b6b9-cc316ffeba27)


![Screenshot 2025-02-10 190736](https://github.com/user-attachments/assets/783b8f94-a0c8-4e97-9675-31eb96fdfe9c)

The build folder has been generated successfully, and the application is 
ready to be deployed. 
If you're planning to deploy your app, you can follow the instructions 
provided to serve the build locally for testing 
Commands: 
sudo npm install -g serve 
 ![image](https://github.com/user-attachments/assets/9769bf52-69a2-437f-86d4-47147f108964)

serve -s build
![Screenshot 2025-02-10 191205](https://github.com/user-attachments/assets/97e6e85b-4eee-4904-a842-3f96404f83a1)

The steps have been completed on the server side. 
Now, refresh the page and open any browser. In the search bar, enter the 
public IP of your frontend server followed by port number 3000, as shown in 
the picture.  
 
 
 
  
 
Now, you should be able to see that the front-end server is up and accessible. 
 
 
 
 
 
 ![Screenshot 2025-02-10 152945](https://github.com/user-attachments/assets/ed3d862f-33ad-4dab-ac24-d5549f3e7236)

 
 
