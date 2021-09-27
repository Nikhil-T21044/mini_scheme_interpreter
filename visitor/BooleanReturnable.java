package visitor;

public class BooleanReturnable implements Returnable {
	private static final ReturnableType type = ReturnableType.BOOLEAN;
	boolean value;
	BooleanReturnable(boolean value){
		this.value = value;
	}
	public String print() {
		if(value) {
			return "#t";
		}else {
			return "#f";
		}
//		return String.valueOf(value);
	};
	public ReturnableType type() {
		return type;
	}
}
