package repositery;

import java.util.LinkedList;



import beans.Atmsimulator;

import beans.Beneficiary;

//import beans.CustomerDetails;





public class Repository {

	//public static final LinkedList<CustomerDetails> CUSTOMER_DETAILS = new LinkedList<CustomerDetails>();

	public static final LinkedList<Beneficiary> BENEFICIARY_DETAILS = new LinkedList<Beneficiary>();

	public static final LinkedList<Atmsimulator> ATM_SIMULATORS = new LinkedList<Atmsimulator>();

	static {
//		  CustomerDetails customerDetails=new CustomerDetails();
//
//		  customerDetails.setAccountNo(123456); customerDetails.setBankBranch("bbsr");
//
//		  customerDetails.setDob("17/06/1997");
//
//		  customerDetails.setEmailId("swainabinash97@gmail.com");
//
//		  customerDetails.setGender("male"); customerDetails.setOpeningBalance(3000);
//
//		  customerDetails.setPassword("abcde");
//
//		  customerDetails.setPhnNo(993235564l); customerDetails.setPin(2231);
//
//		  customerDetails.setUserName("abcd");
//
//		  CUSTOMER_DETAILS.add(customerDetails);

		  

		  

		  Beneficiary beneficiaryDetails=new Beneficiary();

		  beneficiaryDetails.setAccountNo(11002);

		  beneficiaryDetails.setEmailId("monaj@gmail.com");

		  beneficiaryDetails.setFirstName("manoj");

		  beneficiaryDetails.setLastName("swain");

		  beneficiaryDetails.setMobileNo(7895354783l);

		  BENEFICIARY_DETAILS.add(beneficiaryDetails);

	}

	public String add(Beneficiary ben) {

		Beneficiary beneficiaryDetails = new Beneficiary();

		beneficiaryDetails.setAccountNo(ben.getAccountNo());

		beneficiaryDetails.setEmailId(ben.getEmailId());

		beneficiaryDetails.setFirstName(ben.getFirstName());

		beneficiaryDetails.setLastName(ben.getLastName());

		beneficiaryDetails.setMobileNo(ben.getMobileNo());

		BENEFICIARY_DETAILS.add(beneficiaryDetails);

		return "True";

	}

}
