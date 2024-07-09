package spring_2.constructor_injection;

public class Teacher {
	private int id;
	private String name;
	private String email;
	private String pwd;
	private int age;
	
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Teacher(String name, String email, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}

	public Teacher(int id, String name, String email, String pwd, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "\nTeacher [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", age=" + age + "]";
	}
	public Teacher() {
		super();
	}
	
	
}
