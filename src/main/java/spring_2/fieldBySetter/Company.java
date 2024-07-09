package spring_2.fieldBySetter;

public class Company {
	private int id;
	private String name;
	private Employee e;
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", e=" + e + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public Company() {
		super();
	}
	
}
