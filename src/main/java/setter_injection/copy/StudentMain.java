package setter_injection.copy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("student_setter.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		Student b = bf.getBean(Student.class);
		System.out.println(b);
	}
}
