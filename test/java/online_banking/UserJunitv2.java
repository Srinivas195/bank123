package online_banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import beans.Beneficiary;

import controller.UserController;

import factory.UserFactory;

import service.UserService;
//import static org.junit.Assert.assertEquals;

//import org.junit.Test;



public class UserJunitv2 {

	
		@Test

		public void userLoginTestPositive() {

			UserService userService = UserFactory.getUserServiceObject();

			String username = "gopi";

			String password = "gopal999";

			boolean result =userService.userLogin(username, password);

			assertEquals(true, result);

			

		}

		@Test

		public void userLoginTestNegative() {

			UserService userService = UserFactory.getUserServiceObject();;

			

			String username = "likki";

			String password = "gopal999";

			boolean result =userService.userLogin(username, password);

			assertEquals(false, result);

			

		}
		
//		@Test
//
//		public void beneficiaryPositive() {
//
//			UserService userService = UserFactory.getUserServiceObject();;
//
//		
//
//			String firstName = "yugesh";
//
//			String lastName = "verma";
//
//			String email = "yugeshverma@gmail.com";
//
//			double accountNo = 11002;
//
//			long mobileNo = 123456789;
//
//			Beneficiary beneficiary = new Beneficiary();
//
//			beneficiary.setAccountNo(accountNo);
//
//			beneficiary.setEmailId(email);
//
//			beneficiary.setFirstName(firstName);
//
//			beneficiary.setLastName(lastName);
//
//			beneficiary.setMobileNo(mobileNo);
//
//			
//
//			boolean result =userService.beneficiaryDetails(beneficiary);
//
//			assertEquals(true, result);
//
//			
//
//		}

//		@Test
//
//		public void beneficiaryNegative() {
//
//			UserService userService = UserFactory.getUserServiceObject();
//
//		
//
//			String firstName = "yugesh";
//
//			String lastName = "verma";
//
//			String email = "yugeshverma@gmail.com";
//
//			double accountNo = 5555;
//
//			long mobileNo = 123456789;
//
//			Beneficiary beneficiary = new Beneficiary();
//
//			beneficiary.setAccountNo(accountNo);
//
//			beneficiary.setEmailId(email);
//
//			beneficiary.setFirstName(firstName);
//
//			beneficiary.setLastName(lastName);
//
//			beneficiary.setMobileNo(mobileNo);
//
//			
//
//			boolean result =userService.beneficiaryDetails(beneficiary);
//
//			assertEquals(false, result);
//
//			
//
//		}

		

		@Test

		public void AtmSimulatorr() {

			UserService userService = UserFactory.getUserServiceObject();

			int pin=12356;

			String type="debit";

			int amount=3000;

			boolean result =userService.atmSimulator(amount,type,pin);

			assertEquals(true, result);

			

		}

		

		@Test

		public void transferFunds() {

			UserService userService = UserFactory.getUserServiceObject();

			

			String name="yugeshverma";

			int acc=11002;

			int amt=5000;

			String password ="";

			boolean result = userService.transferFund(name, acc, amt, password);

			assertEquals(true, result);

			

			

		}



	

}
