package exceptions;

public class ValidationsException extends RuntimeException{

	public ValidationsException(String message) {

		super(message);

	}public String getMessage() {

		return "pattern mismatch";

	}



}