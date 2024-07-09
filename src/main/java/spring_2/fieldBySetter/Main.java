package spring_2.fieldBySetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource  resource=new ClassPathResource("FeildSetter.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		System.out.println(bf.getBean(Company.class));
	}
}
