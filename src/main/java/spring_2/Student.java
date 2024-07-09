package spring_2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Student {
	public static void main(String[] args) {
		Resource resource =new ClassPathResource("container.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
//		System.out.println(bf);
		
		Student stud=new Student();
		System.out.println(stud);
		Student stud1=new Student();
		System.out.println(stud1);
		Student stud2=new Student();
		System.out.println(stud2);
		
		System.out.println("..................");
		
		Student st = bf.getBean(Student.class);
		System.out.println(st);
		Student st1 = bf.getBean(Student.class);
		System.out.println(st1);
		Student st2 = bf.getBean(Student.class);
		System.out.println(st2);	
		
		System.out.println(bf.getBean("stud", Student.class));
		
		
	}
	
}
