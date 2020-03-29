package repositery;

import java.util.ArrayList;

import java.util.List;



//import beans.AdminDetails;

import beans.Beneficiary;

import beans.UserDetails;





public class Repositery {



	//public static final List<AdminDetails> adminDetailsList=new ArrayList<AdminDetails>();

	public static  List<UserDetails> userDetailsList = new ArrayList<UserDetails>();
	
	public static List<Beneficiary> beneficiaryList=new ArrayList<Beneficiary>();

	
	

	// static variable single_instance of type Singleton 

    private static Repositery single_instance = null;

    

    

    

    

	public List<UserDetails> getUserDetailsList() {

		return userDetailsList;

	}

	public void setUserDetailsList(List<UserDetails> userDetailsList) {

		this.userDetailsList = userDetailsList;

	}

	public static Repositery getInstance() 

    { 

        if (single_instance == null) 

            single_instance = new Repositery(); 

  

        return single_instance; 

    }

	//public static final List<Beneficiary> beneficiaryList=new ArrayList<Beneficiary>();

	public static  List<UserDetails> userDetailsList1 ;

//	static {
//
//		AdminDetails adminDetails1 = new AdminDetails();
//
//		adminDetails1.setUserName("likki");
//
//		adminDetails1.setPassword("likki");
//
//		adminDetailsList.add(adminDetails1);
//
//
//
//		AdminDetails adminDetails2 = new AdminDetails();
//
//		adminDetails2.setUserName("likki2");
//
//		adminDetails2.setPassword("likki2");
//
//		adminDetailsList.add(adminDetails1);
//
//	}
	static {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserName("gopi");
		userDetails.setPassword("gopal999");
		userDetailsList.add(userDetails);
	}
	

	static {

		UserDetails userDetails=new UserDetails();

		userDetails.setEmpId(1);

		userDetails.setFirstName("gopi");

		userDetails.setLastName("pal");

		userDetails.setGender("m");

		userDetails.setDob("1998-10-10");

		userDetails.setAadharNo("1234");

		userDetails.setEmail("gopi.pal@gmail.com");

		userDetails.setMobileNo("1234");

		userDetails.setAddress("bhll");

		userDetails.setBranch("newyork");

		userDetails.setAccountNo("1234");

		userDetails.setOpeningBal("1234");

		userDetails.setPin("1234");

		userDetails.setUserName("gopi");

		userDetails.setPassword("gopal999");

		userDetailsList.add(userDetails);

	}

	 static {

		Beneficiary beneficiaryDetails=new Beneficiary();

		beneficiaryDetails.setFirstName("yugesh");

		beneficiaryDetails.setLastName("verma");

		beneficiaryDetails.setEmailId("yugeshverma@gmail.com");

		beneficiaryDetails.setAccountNo(5555);

		beneficiaryDetails.setMobileNo(12345678l);

		beneficiaryList.add(beneficiaryDetails);

	}



}







