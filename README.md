<b>This project demonstrates how to implement a Many-to-One mapping in Hibernate using Employee and Department entities. Each Employee belongs to a single Department, while a Department can have multiple Employees.</b>
<br><br>
<b>Prerequisites:</b><br>
Before running this project, ensure you have the following installed:
<br>
Java JDK 8 or later <br>
MySQL or any relational database (for persistence) <br>
Hibernate (ORM framework) <br>
<b>Project Structure:</b><br>
The project consists of the following key components:
<br>
<b>1. Entities</b><br>
Employee: Represents the employee table.<br>
Department: Represents the department table.<br>
<b>2. Database</b><br>
Two tables: employee and department.<br>
Relationship: Many employees belong to one department.<br>
<b>3. Configuration</b><br>
Hibernate configuration is done via hibernate.cfg.xml.<br>
Annotation-based mapping is used for defining relationships.<br>

<b>Mapping: Many-to-One</b><br>
Relationship Description <br>
Employee to Department: <br>
Many Employee records map to a single Department. <br>
This is a bidirectional relationship. <br>

<b>Running the Application</b><br>
Set Up the Database:<br>

Create the database and tables based on the schema above.<br>
Configure Hibernate:<br>

Update the hibernate.cfg.xml file with your database details.<br>
Run the Main Class:<br>

Execute the MainClass.java file to insert data into the database.<br>
Verify the Data:<br>

Check the employee and department tables to ensure the data has been inserted correctly.<br>

<b>Technologies Used</b>
Java<br>
Hibernate (ORM Framework)<br>
MySQL (Database)
