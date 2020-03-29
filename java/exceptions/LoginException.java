package exceptions;



public class LoginException extends RuntimeException {

	public LoginException(String message) {

		super(message);

	}public String getMessage(String msg) {

		return "invalid credentials";

	}

}