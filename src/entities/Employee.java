package entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;
	
	public Employee () {
		
	}
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getsalary() {
		return salary;
	}
	public void setsalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}

	@Override
	public String toString() {
		return name + " " + salary ;
	}
	
	
}
