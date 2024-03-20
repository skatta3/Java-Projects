package com.springjdbc.xml;

public class Student {
	   private Integer id;
	   private String name;
	   private Integer age;

	   public Student() {
		   
	   }
	   public Student(String name, int age) {
		   this.name = name;
		   this.age = age;
	   }
	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }
	   public Integer getId() {
	      return id;
	   }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}