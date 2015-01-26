class StdLib {
	public static String concat(String s1, String s2) {
		return s1 + s2;
	}

	public static String concat(String s1, double d) {
		return s1 + d;
	}

	public static String concat(String s1, int i) {
		return s1 + i;
	}

	public static String concat(Object o1, Object o2) {
		return o1.toString() + o2.toString();
	}
}
