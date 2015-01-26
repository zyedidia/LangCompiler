import java.util.*;
import java.lang.reflect.*;

class LangMethod {
	private String fullName;
	private String className;
	private String methodName;

	private String[] paramTypes;

	private boolean isStatic;
	private String returnType;

	public LangMethod(String name, String[] paramTypes) {
		fullName = name;
		String[] nameParts = name.split("\\.");
		className = Lang.qualifiedName(nameParts[nameParts.length - 2]);
		methodName = nameParts[nameParts.length - 1];
		this.paramTypes = paramTypes;

		getInfo();
	}

	private void getInfo() {
		if (ProgramInfo.subTable.contains(className + "." + methodName)) {
			if (ProgramInfo.subTable.contains(className + "." + methodName, paramTypes)) {
				String classMethodName = className + "." + methodName;
				isStatic = ProgramInfo.subTable.isStatic(classMethodName, paramTypes);
				returnType = ProgramInfo.subTable.returnType(classMethodName, paramTypes);
			} else {
				System.err.println("Method " + className + "." + methodName + " does not exist with parameter types " + Arrays.toString(paramTypes));
				System.exit(1);
			}
		} else if (Lang.classExists(className) && !ProgramInfo.classes.contains(className)) {
			try {
				Method m = Class.forName(className).getMethod(methodName, getClassArr(paramTypes));
				isStatic = Modifier.isStatic(m.getModifiers());
				returnType = m.getReturnType().getName();
			} catch (NoSuchMethodException e) {
				System.err.println("Method " + className + "." + methodName + " with params " + Arrays.toString(paramTypes) + " does not exist");
				System.exit(1);
			} catch (ClassNotFoundException e1) {
				System.err.println("Class " + className + " does not exist");
				System.exit(1);
			}
		}	
	}

	public boolean isStatic() {
		return isStatic;
	}

	public String returnType() {
		return returnType;
	}

	private Class[] getClassArr(String[] types) {
		Class[] classes = new Class[types.length];

		for (int i = 0; i < classes.length; i++) {
			classes[i] = Lang.getClass(types[i]);
		}

		return classes;
	}

	public static void main(String[] args) {
		ProgramInfo.init();

		LangMethod m = new LangMethod("Scanner.next", new String[] {});
		System.out.println(m.returnType());

		ProgramInfo.subTable = new SubroutineTable();
		ProgramInfo.subTable.define("Test.hello", "String", true, new String[] {"String"});

		m = new LangMethod("Test.hello", new String[] {"String"});
		System.out.println(m.returnType());
		System.out.println(m.isStatic());

		m = new LangMethod("PrintStream.println", new String[] {"int"});
		System.out.println(m.returnType());
		System.out.println(m.isStatic());
	}
}
