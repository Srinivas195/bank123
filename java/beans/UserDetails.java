package beans;

public class UserDetails {

	private int empId;

	private String firstName;

	private String lastName;

	private String gender;

	private String dob;

	private String aadharNo;

	private String email;

	private String mobileNo;

	private String address;

	private String branch;

	private String accountNo;

	private String openingBal;

	private String pin;

	private String userName;

	private String password;

	private String mobileNo1;

	

	public int getEmpId() {

		return empId;

	}

	public void setEmpId(int empId) {

		this.empId = empId;

	}

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public String getDob() {

		return dob;

	}

	public void setDob(String dob) {

		this.dob = dob;

	}

	public String getAadharNo() {

		return aadharNo;

	}

	public void setAadharNo(String aadharNo) {

		this.aadharNo = aadharNo;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getMobileNo() {

		return mobileNo;

	}

	public void setMobileNo(String mobileNo) {

		this.mobileNo = mobileNo;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {

		this.address = address;

	}

	public String getBranch() {

		return branch;

	}

	public void setBranch(String branch) {

		this.branch = branch;

	}

	public String getAccountNo() {

		return accountNo;

	}

	public void setAccountNo(String accountNo) {

		this.accountNo = accountNo;

	}

	public String getOpeningBal() {

		return openingBal;

	}

	public void setOpeningBal(String openingBal) {

		this.openingBal = openingBal;

	}

	public String getPin() {

		return pin;

	}

	public void setPin(String pin) {

		this.pin = pin;

	}

	public String getUserName() {

		return userName;

	}

	public void setUserName(String userName) {

		this.userName = userName;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	

@Override

	public boolean equals(Object obj) {

	UserDetails user =(UserDetails)obj;

	if(user.getEmpId()==this.getEmpId())

		return true;

	else 

		return false;

	

	}	

	

	

}