package ExceptionHandling;

public class CustomException extends RuntimeException {

	public CustomException(String msg) {
		super(msg);
		System.out.println("Please Correct Divisor");

	}

}
