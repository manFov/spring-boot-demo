package com.yhs.demo.web.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhs.demo.properties.BusinessProperties;

@RestController
public class HelloWorldController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Resource
	private BusinessProperties businessProperties;
	
	/*@Resource 
	private Environment env;*/
	
	@RequestMapping("say")
	public User say(){
		logger.debug("year=" + businessProperties.getYear());
		logger.info("moth=" + businessProperties.getMonth());
		logger.error("day=" + businessProperties.getDay());
		/*System.out.println("year=" + businessProperties.getYear());
		System.out.println("moth=" + businessProperties.getMonth());
		System.out.println("day=" + businessProperties.getDay());*/
		/*System.out.println("year=" + env.getProperty("year"));
		System.out.println("moth=" + env.getProperty("aaa.month"));
		System.out.println("day=" + env.getProperty("day"));*/
		return new User("ttt",3,6);
	}
	
	@RequestMapping("say2")
	public String say2(){
		return "helloWorld";
	}
	
	class User{
		
		private String name;
		
		private int age;
		
		private int weight;

		public User(String name, int age, int weight) {
			this.name = name;
			this.age = age;
			this.weight = weight;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}
	}
}
