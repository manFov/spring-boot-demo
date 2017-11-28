package com.yhs.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("say")
	public User say(){
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
