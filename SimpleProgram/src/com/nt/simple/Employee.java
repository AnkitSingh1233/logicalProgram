package com.nt.simple;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// How many male and female employees are there in the organization?

		                 
		   Map<String,Long> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		   map.entrySet().stream().forEach(System.out::println);
		
		
		

		// Print the name of all departments in the organization?
		/*
		 * List<String> list=
		 * employeeList.stream().map((emp)->emp.getDepartment()).distinct().collect(
		 * Collectors.toList()); list.forEach(System.out::println);
		 */ 

		// What is the average age of male and female employees?

		// Map<String,Double> map =
		// employeeList.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.averagingInt(Employee::getAge)));
		// System.out.println(map);

		// Get the details of highest paid employee in the organization?
		/*
		 * Optional<Employee> opt = employeeList.stream()
		 * .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		 * 
		 * Employee heighestSalary = opt.get();
		 * 
		 * System.out.println("Employee get id::" + heighestSalary.getId());
		 * System.out.println("Employee get name::" + heighestSalary.getName());
		 * 
		 * System.out.println("Employee get Salary::" + heighestSalary.getSalary());
		 * System.out.println("Employee get Age::" + heighestSalary.getAge());
		 * 
		 * System.out.println("Employee get Department::" +
		 * heighestSalary.getDepartment()); System.out.println("Employee get Gender::" +
		 * heighestSalary.getGender());
		 * 
		 * System.out.println("Employee get id::" + heighestSalary.getYearOfJoining());
		 */

		// Get the names of all employees who have joined after 2015?

		/*
		 * Stream<Object> emp=
		 * employeeList.stream().filter(join->join.yearOfJoining>2015).map(empl->empl.
		 * getName()); emp.forEach(name->System.out.println(name));
		 * 
		 * 
		 */
		// Count the number of employees in each department?
		/*
		 * Map<String,Long>
		 * map=employeeList.stream().collect(Collectors.groupingBy(Employee::
		 * getDepartment,Collectors.counting()));
		 * 
		 * map.entrySet().stream().forEach(System.out::println);
		 */

		// What is the average salary of each department?
		/*
		 * Map<String,Double>
		 * map=employeeList.stream().collect(Collectors.groupingBy(emp->emp.
		 * getDepartment(),Collectors.averagingDouble(Employee::getSalary)));
		 * 
		 * map.entrySet().stream().forEach(System.out::println);
		 */

		// department Wise Total Salary?

		/*
		 * Map<String, Double> map = employeeList.stream().collect(
		 * Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.summingDouble(Employee::getSalary)));
		 * 
		 * map.entrySet().forEach(System.out::println);
		 */
		// Get the details of youngest male employee in the product development
		// department?
		/*
		 * Optional<Employee> opt=employeeList.stream().filter(e->e.getGender()=="Male"
		 * && e.getDepartment()=="Product Development")
		 * .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		 */

		/*
		 * Optional<Employee>
		 * opt=employeeList.stream().filter(e->e.getGender()=="Male"&&e.getDepartment()=
		 * ="Product Development") .min(Comparator.comparing(Employee::getAge));
		 * 
		 * Employee emp=opt.get();
		 * 
		 * System.out.println("Employee id::"+emp.getId());
		 * System.out.println("Employee Name::"+emp.getName());
		 * System.out.println("Employee id::"+emp.getAge());
		 * System.out.println("Employee Name::"+emp.getSalary());
		 * System.out.println("Employee id::"+emp.getDepartment());
		 * System.out.println("Employee Name::"+emp.getYearOfJoining());
		 * System.out.println("Employee id::"+emp.getAge());
		 * System.out.println("Employee Name::"+emp.getGender());
		 */

		// Who has the most working experience in the organization?
		/*
		 * Optional<Employee>
		 * opt=employeeList.stream().sorted(Comparator.comparingInt(Employee::
		 * getYearOfJoining)).findFirst();
		 * 
		 * Employee emp=opt.get(); System.out.println("Employee id::"+emp.getId());
		 * System.out.println("Employee Name::"+emp.getName());
		 * System.out.println("Employee id::"+emp.getAge());
		 * System.out.println("Employee Name::"+emp.getSalary());
		 * System.out.println("Employee id::"+emp.getDepartment());
		 * System.out.println("Employee Name::"+emp.getYearOfJoining());
		 * System.out.println("Employee id::"+emp.getAge());
		 * System.out.println("Employee Name::"+emp.getGender());
		 * 
		 */

		// How many male and female employees are there in the sales and marketing team?

		/*
		 * Map<String,Long>
		 * map=employeeList.stream().filter(e->e.getDepartment()=="Sales And Marketing")
		 * .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		 * 
		 * map.entrySet().forEach(System.out::println);
		 * 
		 */
		// What is the average salary of male and female employees?
		/*
		 * Map<String,Double> map=
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingDouble(Employee::getSalary)));
		 * 
		 * map.entrySet().forEach(System.out::println);
		 *
		 * 
		 */

		// List down the names of all employees in each department?
		/*
		 * Map<String, List<Employee>> map =
		 * employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
		 * ;
		 * 
		 * Set<Entry<String, List<Employee>>> entrySet = map.entrySet();
		 * 
		 * for (Entry<String, List<Employee>> entry : entrySet) {
		 * 
		 * System.out.println("---------------------------");
		 * 
		 * System.out.println("Employee in " + entry.getKey());
		 * 
		 * System.out.println("----------------------------");
		 * 
		 * List<Employee> list = entry.getValue(); for (Employee e : list) {
		 * 
		 * System.out.println(e.getName()); }
		 * 
		 * }
		 */

		// What is the average salary and total salary of the whole organization?
		/*
		 * DoubleSummaryStatistics
		 * salary=employeeList.stream().collect(Collectors.summarizingDouble(Employee::
		 * getSalary)); System.out.println("Total Salary "+salary.getSum());
		 * System.out.println("Average of Salary "+salary.getAverage());
		 * 
		 */
		/*
		 * Double sal=employeeList.stream().collect(Collectors.summingDouble(Employee::
		 * getSalary)); System.out.println("Sum of salary "+sal);
		 */

		// Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years.

		/*
		 * Map<Boolean, List<Employee>> map = employeeList.stream()
		 * .collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		 * 
		 * Set<Map.Entry<Boolean, List<Employee>>> entrySet = map.entrySet();
		 * 
		 * for (Map.Entry<Boolean, List<Employee>> entry : entrySet) {
		 * 
		 * System.out.println("----------------");
		 * 
		 * if (entry.getKey()) System.out.println("Employee is Older than 25 "); else
		 * System.out.println("Employee is Younger  than 25 ");
		 * 
		 * System.out.println("----------------");
		 * 
		 * List<Employee> list = entry.getValue(); for (Employee e : list) {
		 * System.out.println(e.getName()); } }
		 */

		//Who is the oldest employee in the organization? What is his age and which department he belongs to?
		/*
		 * Optional<Employee>
		 * opt=employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		 * Employee emp=opt.get();
		 * 
		 * System.out.println("Employee id::"+emp.getName());
		 * System.out.println("Employee Department:: "+emp.getDepartment());
		 * System.out.println("Employee Age:: "+emp.getAge());
		 */
	
	
	
	}
	
	
	

}
