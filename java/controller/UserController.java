package controller;
import java.util.Scanner;

import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;

import beans.Beneficiary;

//import exceptions.AdminException;

import exceptions.LoginException;

//import factory.AdminFactory;

import factory.UserFactory;

//import service.AdminService;

import service.UserService;

public class UserController {

	static Logger log=LogManager.getLogger(UserController.class);

	public static boolean userLogin(String userName, String password) {

		UserService userService = UserFactory.getUserServiceObject();

		return userService.userLogin(userName, password);

	}public static boolean atmSimulator(int amount,String type,int pin) {

		UserService userService = UserFactory.getUserServiceObject();

		return userService.atmSimulator(amount,type,pin);

	}
		//public static boolean beneficiaryDetails(Beneficiary beneficiary) {
//
//		UserService userService = UserFactory.getUserServiceObject();
//
//		return userService.beneficiaryDetails(beneficiary);
//
//	}
		public static boolean transferFund(String senderName,int accountNo,int amount,String password){

		UserService userService = UserFactory.getUserServiceObject();

		return userService.transferFund(senderName,accountNo,amount,password);

	}

	

	

	public void loginUser(){

		Scanner scanner = new Scanner(System.in);

		log.info("enter username:");

		String userName = scanner.nextLine();

		log.info("enter password:");

		String password = scanner.nextLine();



		boolean success = userLogin(userName, password);

		if(success) {

		/*log.info("Welcome gopi pal!");

		log.info("Ac/No:6666");

		log.info("balance:2,515");

		log.info("you have 1 benefeciaries");*/

			log.info("login sucessfull");

		}

		if (!success) {

			throw new LoginException("invalid credentials");

		}	



	}public void atmSimulatorr() {

		Scanner scanner = new Scanner(System.in);

		log.info("enter amount:");

		int amount=scanner.nextInt();

		log.info("enter type(Debit/credit)");

		String type=scanner.next();

		log.info("enter pin");

		int pin=scanner.nextInt();

		boolean success=atmSimulator(amount,type,pin);

		log.info("sucess"+success);

		if(!success) {

			throw new LoginException("invalid credentials");

		}



	}
//	public void beneficiary() {
//
//		Scanner scanner = new Scanner(System.in);
//
//		Beneficiary beneficiary=new Beneficiary();
//
//		log.info("enter first name");
//
//		String firstName=scanner.next();
//
//		beneficiary.setFirstName(firstName);
//
//		log.info("enter last name");
//
//		String lastName=scanner.next();
//
//		beneficiary.setLastName(lastName);
//
//		log.info("enter account number");
//
//		int accountNo=scanner.nextInt();
//
//		beneficiary.setMobileNo(accountNo);
//
//		log.info("enter email id");
//
//		String email=scanner.next();
//
//		beneficiary.setEmailId(email);
//
//		log.info("enter account number");
//
//		long mobileNo=scanner.nextInt();
//
//		beneficiary.setMobileNo(mobileNo);

//		boolean success=beneficiaryDetails(beneficiary);
//
//		log.info("success"+success);
//
//		if(!success) {
//
//			throw new LoginException("invalid credentials");
//
//		}

//	}

	public void transferFunds() {

		Scanner scanner=new Scanner(System.in);

		System.out.println("enter sender name");

		String senderName=scanner.next();

		System.out.println("enter account number");

		int accountNo=scanner.nextInt();

		System.out.println("enter amount");

		int amount=scanner.nextInt();

		System.out.println("enter password");

		String password=scanner.next();

		boolean success=transferFund(senderName,accountNo,amount,password);

		if(!success) {

			throw new LoginException("Transfer Failed");

		}

		else {

			System.out.println("Funds transferred sucessfully to"+accountNo);

		}

	}

	

	public void printAll() {

		UserService userService = UserFactory.getUserServiceObject();

		userService.printAll();

	}

}
