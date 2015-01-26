import java.util.*;

class SymbolTable {
	private ArrayList<String> name;
	private ArrayList<String> type;

	public SymbolTable() {
		name = new ArrayList<String>();
		type = new ArrayList<String>();
	}

	public void define(String varName, String varType) {
		name.add(varName);
		type.add(varType);
	}

	public void redefine(String varName, String varType) {
		type.set(indOf(varName), varType);
	}

	public int getNum(String varName) {
		return indOf(varName);
	}

	public String getType(String varName) {
		return type.get(indOf(varName));
	}

	public boolean contains(String varName) {
		return name.contains(varName);
	}

	public int numLocals() {
		return name.size();
	}
	
	public void clear() {
		name.clear();
		type.clear();
	}

	private int indOf(String varName) {
		int index = name.indexOf(varName);
		if (index == -1) {
			System.out.println("Variable " + varName + " has not been defined");
			System.exit(1);
		}
		return index;
	}
}
