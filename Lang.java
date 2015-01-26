class Lang {
	public static String typeToAbbrev(String type) {
		if (type.equals("int")) {
			return "i";
		} else if (type.equals("long")) {
			return "l";
		} else if (type.equals("short")) {
			return "s";
		} else if (type.equals("byte")) {
			return "b";
		} else if (type.equals("char")) {
			return "c";
		} else if (type.equals("float")) {
			return "f";
		} else if (type.equals("double")) {
			return "d";
		} else if (type.equals("bool") || type.equals("boolean")) {
			return "i";
		} else if (type.equals("void")) {
			return "";
		} else {
			return "a";
		}
	}

	public static String typeToDescriptor(String type) {
		if (type.indexOf("[") == 0) {
			return type;
		}
		int length = type.split("\\[").length;
		if (length > 1) {
			String descriptor = "";
			for (int i = 0; i < length - 1; i++) {
				descriptor += "[";
			}
			descriptor += typeToDescriptor(type.substring(0, type.indexOf("[")));
			return descriptor;
		} else if (type.equals("int")) {
			return "I";
		} else if (type.equals("long")) {
			return "J";
		} else if (type.equals("short")) {
			return "S";
		} else if (type.equals("byte")) {
			return "B";
		} else if (type.equals("char")) {
			return "C";
		} else if (type.equals("float")) {
			return "F";
		} else if (type.equals("double")) {
			return "D";
		} else if (type.matches("bool|boolean")) {
			return "Z";
		} else if (type.equals("void")) {
			return "V";
		} else {
			return "L" + type.replaceAll("\\.", "/") + ";";
		}
	}

	public static String qualifiedName(String className) {
		int index = className.indexOf("[");
		String noArrayName = className;
		if (index != -1) {
			noArrayName = className.substring(0, index);
		}
		for (String s : ProgramInfo.importList) {
			if (classExists(s + "." + noArrayName)) {
				return s + "." + className;
			}
		}

		return className;
	}

	public static boolean classExists(String fullClassName) {
		if (ProgramInfo.classes.contains(fullClassName)) {
			return true;
		}
		try {
			Class.forName(fullClassName);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String[] getType(String className) {
		String varName = "";

		if (ProgramInfo.symTable.contains(className)) {
			varName = className;
			className = ProgramInfo.symTable.getType(varName);
		}

		return new String[] {className, varName};
	}

	public static Class getClass(String type) {
		if (type.equals("int")) {
			return int.class;
		} else if (type.equals("boolean")) {
			return boolean.class;
		} else if (type.equals("double")) {
			return double.class;
		} else if (type.equals("float")) {
			return float.class;
		} else if (type.equals("long")) {
			return long.class;
		} else if (type.equals("char")) {
			return char.class;
		} else {
			try {
				return Class.forName(qualifiedName(type));
			} catch (ClassNotFoundException e) {
				System.err.println("Class " + type + " does not exist");
				System.exit(1);
			}
		}

		return int.class;
	}
}
