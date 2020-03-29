package dao;


	import java.util.List;



	import beans.Beneficiary;

	//import beans.UserDetails;





	public interface UserDao {

		public boolean userLogin(String userName, String password);

		public boolean atmSimulator(int amount,String type,int pin);

		public boolean beneficiaryDetails(Beneficiary beneficiary);

		public boolean transferFund(String senderName, int accountNo, int amount, String password);

		void printAll();

	}
	
	

