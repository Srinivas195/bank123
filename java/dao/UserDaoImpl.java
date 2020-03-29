package dao;

import java.util.List;

import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;



//import beans.AdminDetails;

import beans.Atmsimulator;

import beans.Beneficiary;

import beans.Transferfunds;

import beans.UserDetails;
import beans.UserLoginDetails;

//import beans.UserLoginDetails;

//import controller.AdminController;

import exceptions.ValidationsException;

//import factory.AdminFactory;

import factory.UserFactory;

import repositery.Repositery;

import repositery.Repository;

import validation.TransferValidation;

import validation.ValidationResult;



public class UserDaoImpl  implements UserDao{

	static Logger log=LogManager.getLogger(UserDaoImpl.class);

	Repositery repositery = Repositery.getInstance();

	public boolean userLogin(String userName, String password) {

		

		

		UserLoginDetails userLoginDetails=new UserLoginDetails();

		userLoginDetails.setUserName(userName);

		userLoginDetails.setPassword(password);

		

		List<UserDetails> repositoryuserList= repositery.getUserDetailsList();

		for(UserDetails user : repositoryuserList) {

			if(user.getUserName().equals(userLoginDetails.getUserName())

					&&user.getPassword().equals(userLoginDetails.getPassword())) {



				return true;

			}

		}

		return false;

	}public boolean atmSimulator(int amount,String type,int pin) {

		Atmsimulator atmDetails=new Atmsimulator();

		atmDetails.setAmount(amount);

		atmDetails.setType(type);

		atmDetails.setPin(pin);

		//Repositery repositery = UserFactory.getRepositoryObject();

		List<UserDetails> repositoryuserList= repositery.getUserDetailsList();

		for(UserDetails user : repositoryuserList) {

			if(user.getPin().equals(Integer.toString(atmDetails.getPin()))) {

				return true;

			}

		}

		return false;

	}

	public boolean beneficiaryDetails(Beneficiary beneficiary) {

		Beneficiary beneficiaryDetails=new Beneficiary();

		//Repositery repositery = AdminFactory.getRepositoryObject();

		List<Beneficiary> beneficiaryDetailList = Repositery.beneficiaryList;

		for(Beneficiary beneficiaryy:beneficiaryDetailList) {

			boolean result=((beneficiaryDetails.getFirstName().equals(beneficiaryy.getFirstName()))

					&&(beneficiaryDetails.getLastName().equals(beneficiaryy.getLastName()))

					&&(beneficiaryDetails.getEmailId().equals(beneficiaryy.getEmailId()))

					&&(beneficiaryDetails.getMobileNo()==beneficiaryy.getMobileNo())

					&&(beneficiaryDetails.getAccountNo()==beneficiary.getAccountNo()));

			if(result==true) {

				return true;

			}

		}

		return false;

	}

	public boolean transferFund(String senderName, int accountNo, int amount, String password) {

		Transferfunds transferFund=new Transferfunds();

		transferFund.setSenderName(senderName);

		transferFund.setAccountNo(accountNo);

		transferFund.setAmount(amount);

		transferFund.setPassword(password);

		ValidationResult validationResult =

				TransferValidation.validateUserDetails(transferFund);

		if(validationResult.isResult()) {

			throw new ValidationsException(validationResult.getMessage());

		}

		//Repositery repositery = AdminFactory.getRepositoryObject();

		List<Beneficiary> beneficiaryDetailList = Repository.BENEFICIARY_DETAILS;

		for(Beneficiary beneficiaryy:beneficiaryDetailList) {

			boolean result=(beneficiaryy.getAccountNo()==transferFund.getAccountNo());

			if(result==true) {

				return true;

			}

		}

		return false;

	}

	public void printAll() {

		//Repositery repositery = UserFactory.getRepositoryObject();

		List<UserDetails> userDetailList = repositery.getUserDetailsList();

		for(UserDetails user :userDetailList) {

			log.info(user.getFirstName());

			log.info(user.getLastName());

			log.info(user.getGender());

			log.info(user.getDob());

			log.info(user.getAadharNo());

			log.info(user.getEmail());

			log.info(user.getMobileNo());

			log.info(user.getAddress());

			log.info(user.getBranch());

			log.info(user.getAccountNo());

			log.info(user.getOpeningBal());

			log.info(user.getPin());

			log.info(user.getUserName());

			log.info(user.getPassword());

		}

		

	}



}
