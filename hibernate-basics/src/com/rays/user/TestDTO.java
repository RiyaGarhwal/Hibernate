package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDTO {

	public static void main(String[] args) {

	//testAdd();
//	testSearch();
//	testUpdate();
//		testDelete();
	testGet();
//		testAuth();

	}

	private static void testAdd() {

		UserDTO dto = new UserDTO();
		dto.setFirstname("Shreya");
		dto.setLastname("Garhwal");
		dto.setLoginId("shreya5@gmail.com");
		dto.setPassword("Shrey@123");
		dto.setDob(new Date());
		dto.setAddress("Indore");

		UserModel model = new UserModel();

		model.add(dto);

	}

	private static void testUpdate() {

		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstname("Sanat");
		dto.setLastname("Chouhan");
		dto.setLoginId("sanat5@gmail.com");
		dto.setPassword("Sanat@123");
		dto.setDob(new Date());
		dto.setAddress("Bhopal");

		UserModel model = new UserModel();

		model.update(dto);

	}

	private static void testAuth() {

		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("riyagarhwal0612@gmail.com", "Riya@123");

		if (dto != null) {

			System.out.println(dto.getId());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getFirstname());
			System.out.println(dto.getLastname());
			System.out.println(dto.getAddress());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());

		} else {
			System.out.println("Authentication failed..!!");
		}
	}
	
	private static void testDelete() {
		
		UserDTO dto = new UserDTO();
		
		dto.setId(2);
		
		UserModel model = new UserModel();
		
		model.delete(dto);
	}

	private static void testGet() {
		
		UserModel model = new UserModel();
		
		UserDTO dto = model.findByPk(0);
		
		System.out.println(dto.getFirstname());
		System.out.println(dto.getId());
		System.out.println(dto.getLastname());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getAddress());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		
		
	}
	
	private static void testSearch() {
		
		UserDTO dto = new UserDTO();
		
		UserModel model = new UserModel();
		
		List list = model.search(dto);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			dto = (UserDTO)it.next();
			
			System.out.println(dto.getId());
			System.out.print("\t" + dto.getLastname());
			System.out.print("\t" + dto.getFirstname());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}
	}
	
}
