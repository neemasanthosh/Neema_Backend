package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.HindiTeacher;

public class SpringDriver {

	public static void main(String[] args) {
	//1. load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		
		//2.Retrieve bean from spring container
		Teacher teacher = context.getBean("hindiTeacher", HindiTeacher.class);
		
		//3.call methods on the beam
		System.out.println(teacher.gethomework());
		
		//4. close the context
		context.close();
	}

}
