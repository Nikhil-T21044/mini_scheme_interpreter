package visitor;

import syntaxtree.*;

public class ProcedureReturnable implements Returnable {
	private static final ReturnableType type = ReturnableType.LAMBDA;
//	ProcedureExp value;
	private Environment scope;
	String name = "Anonymous";
	String[] arguments;
	Expression body;
	ProcedureReturnable(Environment scope){
		this.scope = scope;
	}
	public String print() {
		return "<procedure: lambda ("+String.join( " ", this.arguments )+")>\n" ;
	};
	public ReturnableType type() {
		return type;
	}
	public void addArgument(String name, int index) {
		this.arguments[index] = name;
	}
	public void setName(String x) {
		this.name = x;
	}
	
	public Environment getScope() {
		return this.scope;
	}
}
