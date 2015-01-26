import java.util.*;

class FieldTable {
	private ArrayList<String> name;
	private ArrayList<String> type;
	private ArrayList<Boolean> isStatic;

	public FieldTable() {
		name = new ArrayList<String>();
		type = new ArrayList<String>();
		isStatic = new ArrayList<Boolean>();
	}

	public void define(String fieldName, String fieldType, boolean isStatic) {
		name.add(fieldName);
		type.add(fieldType);
		this.isStatic.add(isStatic);
	}

	public String getType(String fieldName) {
		return type.get(name.indexOf(fieldName));
	}

	public boolean isStatic(String fieldName) {
		return isStatic.get(name.indexOf(fieldName));
	}

	public boolean contains(String fieldName) {
		return name.contains(fieldName);
	}

	public void clear() {
		name.clear();
		type.clear();
		isStatic.clear();
	}
}
