package calculator;

public class Calculator {

	private int result;
	
	public int getResult() {
		return result;
	}
	public void performOperation(Operation operation, int b) {
		result = operation.execute(result, b);
		
	}
}