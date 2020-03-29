package service;

import beans.Beneficiary;



public interface UserService {

	public boolean userLogin(String userName, String password);

	public boolean atmSimulator(int amount,String type,int pin);

	//public boolean beneficiaryDetails(Beneficiary beneficiary);

	public boolean transferFund(String senderName,int accountNo,int amount,String password);

	void printAll();

}
