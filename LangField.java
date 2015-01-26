import java.util.*;
import java.lang.reflect.*;

class LangField {
	private String className;
	private String fieldName;
	private String type;
	private boolean isStatic;

	public LangField(String name) {
		String[] nameParts = name.split("\\.");
		className = Lang.qualifiedName(nameParts[nameParts.length - 2]);
		fieldName = nameParts[nameParts.length - 1];

		getInfo();
	}

	private void getInfo() {
		if (ProgramInfo.fieldTable.contains(className + "." + fieldName)) {
			type = ProgramInfo.fieldTable.getType(className + "." + fieldName);
			isStatic = ProgramInfo.fieldTable.isStatic(className + "." + fieldName);
		} else if (Lang.classExists(className) && !ProgramInfo.classes.contains(Lang.qualifiedName(className))) {
			try {
				Class c = Class.forName(className);
				Field f = c.getField(fieldName);
				type = f.getType().getName();
				isStatic = Modifier.isStatic(f.getModifiers());
			} catch (NoSuchFieldException e) {
				System.err.println("Field " + className + "." + fieldName + " does not exist!");
				System.exit(1);
			} catch (ClassNotFoundException e1) {
				System.err.println("Class " + className + " does not exist!");
				System.exit(1);
			}
		}
	}

	public String type() {
		return type;
	}

	public boolean isStatic() {
		return isStatic;
	}

	public static void main(String[] args) {
		ProgramInfo.init();
		ProgramInfo.fieldTable.define("Test.hello", "String", false);

		LangField f = new LangField("java.lang.System.out");
		System.out.println(f.type());
		System.out.println(f.isStatic());
	}
}
