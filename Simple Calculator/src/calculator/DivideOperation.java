package calculator;

public class DivideOperation implements Operation {


	@Override
	public int execute(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public OperationType getType() {
		// TODO Auto-generated method stub
		return OperationType.DIVIDE;
	}

}
