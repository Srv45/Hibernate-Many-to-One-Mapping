package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Department;
import com.entities.Employee;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e1 = new Employee();
		e1.setEmp_Name("Shubham");
		e1.setSalary(50000);

		Employee e2 = new Employee();
		e2.setEmp_Name("Rahul");
		e2.setSalary(40000);

		Employee e3 = new Employee();
		e3.setEmp_Name("Kiara");
		e3.setSalary(45000);

		Employee e4 = new Employee();
		e4.setEmp_Name("Ayra");
		e4.setSalary(65000);

		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		ss.persist(e4);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		Department d1 = new Department();
		d1.setDept_Id(1011);
		d1.setDept_Name("Java Developer");

		Department d2 = new Department();
		d2.setDept_Id(1014);
		d2.setDept_Name("Python Developer");

		e1.setDept(d1);
		e2.setDept(d1);
		e3.setDept(d2);
		e4.setDept(d2);

		d1.setEmp(list);
		d2.setEmp(list);

		ss.persist(d1);
		ss.persist(d2);

		tr.commit();
		ss.close();

		System.out.println("Data inserted successfully!");
	}

}
