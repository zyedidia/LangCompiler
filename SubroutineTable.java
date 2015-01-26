import java.util.*;

class SubroutineTable {
	private ArrayList<String> name;
	private ArrayList<String> returnType;
	private ArrayList<Boolean> isStatic;
	private ArrayList<String[]> parameterTypes;
	private ArrayList<Integer> locals;
	private ArrayList<Integer> stack;

	public SubroutineTable() {
		name = new ArrayList<String>();
		returnType = new ArrayList<String>();
		isStatic = new ArrayList<Boolean>();
		parameterTypes = new ArrayList<String[]>();
		locals = new ArrayList<Integer>();
		stack = new ArrayList<Integer>();
	}

	public void define(String methodName, String returnType, boolean isStatic, String[] paramTypes) {
		name.add(methodName);
		this.returnType.add(returnType);
		this.isStatic.add(isStatic);
		parameterTypes.add(paramTypes);
	}

	public void addStack(int stack) {
		this.stack.add(stack);
	}

	public void addLocals(int locals) {
		this.locals.add(locals);
	}

	public String returnType(String methodName, String[] paramTypes) {
		return returnType.get(indexOf(methodName, paramTypes));
	}

	public boolean isStatic(String methodName, String[] paramTypes) {
		return isStatic.get(indexOf(methodName, paramTypes)); 
	}

	public int getStack(String methodName, String[] paramTypes) {
		return stack.get(indexOf(methodName, paramTypes));
	}

	public int getLocals(String methodName, String[] paramTypes) {
		return locals.get(indexOf(methodName, paramTypes));
	}

	public boolean contains(String methodName, String[] paramTypes) {
		return indexOf(methodName, paramTypes) != -1;
	}

	public boolean contains(String methodName) {
		return name.contains(methodName);
	}

	public void clear() { name.clear();
		returnType.clear();
		isStatic.clear();
		parameterTypes.clear();
		stack.clear();
		locals.clear();
	}

	private int indexOf(String name, String[] paramTypes) {
		for (int i = 0; i < this.name.size(); i++) {
			if (this.name.get(i).equals(name)) {
				if (Arrays.equals(this.parameterTypes.get(i), paramTypes)) {
					return i;
				}
			}
		}

		return -1;
	}
}
