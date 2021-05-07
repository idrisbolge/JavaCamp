package Homework5.core.utils.result;

public class Result {
	private final boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}

	public Result(boolean success, String message) {
		this.success = success;
		this.message = message;
	}
	
	public String getMessage() {return message;}
	
	public boolean isSuccess() {return success;}
}
