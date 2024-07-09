package setter_injection.copy;

public class Student {
	private int id;
	private String name;
	private String email;
	private double marks;
	private int age;
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + ", age=" + age + "]";
	}
	public Student(int id, String name, String email, double marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.age = age;
	}
	public Student() {
		super();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
