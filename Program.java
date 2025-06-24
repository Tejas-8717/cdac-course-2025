import java.util.Set;

class Employee {
	private int empid;
	private String name;
	private double salary;

	// paramaterless ctor
	public Employee() {
		System.out.println("Employee Parametrless Ctor");
		this.name = "";
		this.salary = 100;
	}

	// paramaterized ctor
	public Employee(int empid, String name, double salary) {
		System.out.println("Employee Paramaterized Ctor");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	// setters
    public void setName(String name) {
		this.name = name;
	}
	public void setEmpid(int empid) {
		if (empid < 0)
			return;
		this.empid = empid;
	}

	// getters
	public double getSalary() {
		return salary;
	}
	
	public int getEmpid() {
		return empid;
	}

	// TO-DO
	// Implement the setters and getters for the name and salary
	// also provide the acceptEmployee()

	// 
	public void displayEmployee() {
		System.out.println("Empid -" + this.empid);
		System.out.println("Name -" + name);
		System.out.println("Salary -" + salary);
	}

}

public class Program {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(2, "Mukesh", 10000);
		e1.displayEmployee();
		e2.displayEmployee();

		// e1.empid = 1;
		e1.setEmpid(1);
		e1.setName("kesh");
		e1.displayEmployee();

//		System.out.println("e1.empid - " + e1.empid);
		System.out.println("e1.empid - " + e1.getEmpid());

	}

}
