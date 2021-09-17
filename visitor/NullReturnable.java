package visitor;

public class NullReturnable implements Returnable {
	private static final ReturnableType type = ReturnableType.NULL;
	@Override
	public String print() {
		return "";
	}
	public ReturnableType type() {
		return type;
	}
}
