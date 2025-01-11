This project demonstrates how to implement a Many-to-One mapping in Hibernate using Employee and Department entities. Each Employee belongs to a single Department, while a Department can have multiple Employees.

Prerequisites
Before running this project, ensure you have the following installed:

Java JDK 8 or later
MySQL or any relational database (for persistence)
Hibernate (ORM framework)
Project Structure
The project consists of the following key components:

1. Entities
Employee: Represents the employee table.
Department: Represents the department table.
2. Database
Two tables: employee and department.
Relationship: Many employees belong to one department.
3. Configuration
Hibernate configuration is done via hibernate.cfg.xml.
Annotation-based mapping is used for defining relationships.

Mapping: Many-to-One
Relationship Description
Employee to Department:
Many Employee records map to a single Department.
This is a bidirectional relationship.

Running the Application
Set Up the Database:

Create the database and tables based on the schema above.
Configure Hibernate:

Update the hibernate.cfg.xml file with your database details.
Run the Main Class:

Execute the MainClass.java file to insert data into the database.
Verify the Data:

Check the employee and department tables to ensure the data has been inserted correctly.

Technologies Used
Java
Hibernate (ORM Framework)
MySQL (Database)
