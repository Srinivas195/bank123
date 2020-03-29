package exceptions;

public class EmailAlreadyExistException extends Exception {

	String msg = "Email already exist";



	public EmailAlreadyExistException() {

	}

	

	public  EmailAlreadyExistException(String msg) {

		this.msg = msg;

	}

	

	@Override

	public String getMessage() {

		return msg;

	}

}
