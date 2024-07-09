package spring_2.constructor_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TeacherMain{
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("constructor-injection.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		Teacher t = bf.getBean(Teacher.class);
		System.out.println(t);
	}
}
