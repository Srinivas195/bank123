package service;

import java.util.List;



import beans.Beneficiary;

import beans.UserDetails;

import dao.UserDao;

import exceptions.ValidationsException;

import factory.UserFactory;

import validation.AtmValidation;



public class UserServiceImpl implements UserService {



	public boolean userLogin(String userName, String password) {

		UserDao userDao = UserFactory.createUserDaoObject();



		return userDao.userLogin(userName, password);



	}

	public boolean atmSimulator(int amount,String type,int pin) {

		

		if(!AtmValidation.validateAmount(amount)) {

			throw new ValidationsException("Invalid amount");

		}

		if(!AtmValidation.validateType(type)) {

			throw new ValidationsException("Invalid type");

		}

		if(!AtmValidation.validatePin(pin)) {

			throw new ValidationsException("Invalid pin");

		}

		UserDao userDao = UserFactory.createUserDaoObject();



		return userDao.atmSimulator(amount, type,pin);



	}

//	public boolean beneficiaryDetails(Beneficiary beneficiary) {
//
//		UserDao userDao = UserFactory.createUserDaoObject();
//
//
//
//		return userDao.beneficiaryDetails(beneficiary);
//
//		
//
//	}

	public boolean transferFund(String senderName, int accountNo, int amount, String password) {

		UserDao userDao = UserFactory.createUserDaoObject();



		return userDao.transferFund(senderName, accountNo, amount, password);

		

	}

	public void printAll(){

		

		UserDao userDao = UserFactory.createUserDaoObject();

		 userDao.printAll();

	}



}