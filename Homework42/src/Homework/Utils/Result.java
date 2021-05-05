package Homework.Utils;

public class Result implements Homework.Abstract.Result {

	private boolean success;
	private String message;
	
	
	
	
	public Result(boolean success) {
		super();
		this.success = success;
	}

	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return success;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
