package spring_2.fieldBySetter;

public class Employee {
	private int id;

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee() {
		super();
	}
	
}
