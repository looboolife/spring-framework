package com.shengsiyuan.spring;

import com.shengsiyuan.spring.bean.Student;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringClient {
	public static void main(String[] args) {
		ClassPathResource classPathResource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		beanDefinitionReader.loadBeanDefinitions(classPathResource);
		Student student = beanFactory.getBean(Student.class);
		System.out.println(student);

		new ClassPathXmlApplicationContext()

	}
}
