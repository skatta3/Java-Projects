package com.springjdbc.main;

import com.springjdbc.api.Student;
import com.springjdbc.dao.StudentDAO;
import com.springjdbc.dao.StudentDAOImpl;

public class MainApp {

		public static void main(String[] args) {
			Student std1 = new Student();
			std1.setRollno(16);
			std1.setFirstname("Srinivas");
			std1.setLastname("Katta");
			std1.setStandard("Tenth");
			std1.setAge(22);
			
			StudentDAO stDao = new StudentDAOImpl();
			stDao.insert(std1);
		}
}
