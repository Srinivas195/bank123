package validation;

import beans.Transferfunds;

import beans.UserDetails;



public class TransferValidation {

	public static final String senderName="^[a-z0-9_-]{3,15}$";

	public static final String accountNo="\\d{11}$";

	public static final String amount="\\d{4}$";

	public static final String password="^[a-z0-9_-]{3,15}$";

	

	public static ValidationResult validateUserDetails(Transferfunds transferFund) {

		boolean result = false;

		String message = null;

		ValidationResult validationResult = new ValidationResult();

		if(Integer.toString(transferFund.getAccountNo()).matches(accountNo)) {

			result = true;
		}

		else {
			
			result = false;

			message = "Please enter a valid accountNo";

			validationResult.setMessage(message);

			validationResult.setResult(result);

			return validationResult;

		}

		if(Integer.toString(transferFund.getAmount()).matches(amount)) {

			result = true;

		}

		else {

			result = false;

			message = "Please enter a valid amount";

			validationResult.setMessage(message);

			validationResult.setResult(result);

			return validationResult;

			

		}

		if(transferFund.getPassword().matches(password)) {

			result = true;

		}

		else {

			result = false;

			message = "Please enter a valid password";

			validationResult.setMessage(message);

			validationResult.setResult(result);

			return validationResult;

		}

		if(transferFund.getSenderName().matches(senderName)) {

			result = true;

		}

		else {

			result = false;

			message = "Please enter a valid senderName";

			validationResult.setMessage(message);

			validationResult.setResult(result);

			return validationResult;

		}

		

		return validationResult;

	}

}