package visitor;

public class ErrReturnable implements Returnable {
	private static final ReturnableType type = ReturnableType.ERR;
	String value = "";
	@Override
	public ReturnableType type() {
		return type;
	}

	@Override
	public String print() {
		return value;
	}
	
	ErrReturnable(String value){
		this.value = value;
	}

}
