package controller;


import java.util.Scanner;

import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;



public class MainController {

	static Logger log = LogManager.getLogger(MainController.class);



	public static void main(String[] args) {

		//AdminController adminController = new AdminController();

		UserController userController = new UserController();

//		log.info("1.Login as Admin");
//
		Scanner scanner = new Scanner(System.in);
//
//		int choice = scanner.nextInt();
//
//		switch (choice) {
//
//		case 1:
//
//			adminController.admin();
//
//			log.info("1.Add customer");
//
//			log.info("2.Edit/update Details");
//
//			log.info("3.Post News");
//
//			Scanner scanner1 = new Scanner(System.in);
//
//			int choice1 = scanner1.nextInt();
//
//			switch (choice1) {
//
//			case 1:
//
//				adminController.createUser();
//
//
//
//			case 2:
//
//				log.info("do you want to update the user Y/N");
//
//				String input = scanner1.next();
//
//				if(input.equalsIgnoreCase("N"))
//
//					break;
//
//				adminController.updateDetails();
//
//
//
//			case 3:
//
//				adminController.postNews();
//
//
//
//			}
//
//		}

		log.info("login as user");



		userController.loginUser();

		log.info("please choose one of the options below");

		log.info("1.View Account Details");

		log.info("2.ATM simulator");

		log.info("3.Add/delete beneficiary Details");

		log.info("4.TransferFund");

		int choice2 = scanner.nextInt();

		switch (choice2) {



		case 1:

			userController.printAll();

			break;

		case 2:

			userController.atmSimulatorr();

			break;

//		case 3:
//
//			CustomerController customerController = new CustomerController();
//
//			customerController.option();
//
//			userController.beneficiary();
//
//			break;



		case 4:

			userController.transferFunds();

			break;

		default:log.info("enter proper choice");

		}



	}



}
