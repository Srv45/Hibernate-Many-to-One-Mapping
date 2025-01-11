<b>This project demonstrates how to implement a Many-to-One mapping in Hibernate using Employee and Department entities. Each Employee belongs to a single Department, while a Department can have multiple Employees.</b>
<br>
<b>Prerequisites:</b>
Before running this project, ensure you have the following installed:
<br>
Java JDK 8 or later <br>
MySQL or any relational database (for persistence) <br>
Hibernate (ORM framework) <br>
<b>Project Structure:</b>
The project consists of the following key components:
<br>
<b>1. Entities</b>
Employee: Represents the employee table.<br>
Department: Represents the department table.<br>
<b>2. Database</b>
Two tables: employee and department.<br>
Relationship: Many employees belong to one department.<br>
<b>3. Configuration</b>
Hibernate configuration is done via hibernate.cfg.xml.<br>
Annotation-based mapping is used for defining relationships.<br>

<b>Mapping: Many-to-One</b>
Relationship Description <br>
Employee to Department: <br>
Many Employee records map to a single Department. <br>
This is a bidirectional relationship. <br>

<b>Running the Application</b>
Set Up the Database:

Create the database and tables based on the schema above.
Configure Hibernate:

Update the hibernate.cfg.xml file with your database details.
Run the Main Class:

Execute the MainClass.java file to insert data into the database.
Verify the Data:

Check the employee and department tables to ensure the data has been inserted correctly.

<b>Technologies Used</b>
Java
Hibernate (ORM Framework)
MySQL (Database)
