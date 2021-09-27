package visitor;

import java.util.HashMap;

public class Environment {
//	ReturnableType type = ReturnableType.ENV;
	private Environment parent;

	private HashMap<String, Returnable> table; // to store its symbol table
	
	public Environment(){
		
		table = new HashMap<String, Returnable>();
	}
	
	public Environment(Environment parent){
		this.parent = parent;
		table = new HashMap<String, Returnable>();
	}
	
	public Returnable get(String id) {
		if(table.containsKey(id)) { // get in current scope variable
			return table.get(id);
		}
		if(this.parent != null) { // get from parent scope variable
			return parent.get(id);
		}
		return null;  // no such variable found
	}
	
	public Returnable add(String id, Returnable info) {
		return table.put(id, info); // always defining variable in same scope
	}
	
	public Returnable update(String id, Returnable info) {
		
		if(table.containsKey(id)) { // update in current scope variable
			return table.put(id, info);
		}
		
		if(this.parent != null) // update parent scope variable
			return parent.update(id, info);

		
		//Error no such variable found
		return null;
	}
	
//	public String print() {
//		return "";
//	};
//	public ReturnableType type() {
//		return type;
//	}	
}
