package visitor;

public class IntegerReturnable implements Returnable {
	private static final ReturnableType type = ReturnableType.INT;
	int value;
	IntegerReturnable(int value){
		this.value = value;
	}
	
	public String print() {
		return String.valueOf(value) + "\n";// + type;
	};
	public ReturnableType type() {
		return type;
	}
}
