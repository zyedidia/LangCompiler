import java.util.*;

class ProgramInfo {
	public static ArrayList<String> importList;
	public static SubroutineTable subTable;
	public static FieldTable fieldTable;
	public static SymbolTable symTable;
	public static ArrayList<String> classes;
	public static int labelNum;
	public static int ifLabelNum;
	public static int whileLabelNum;
	public static Stack<Integer> whileLabelStack;
	public static Stack<Integer> ifLabelStack;
	public static int mainStack;
	public static int mainLocals;

	public static void init() {
		importList = new ArrayList<String>();
		subTable = new SubroutineTable();
		fieldTable = new FieldTable();
		symTable = new SymbolTable();
		classes = new ArrayList<String>();
		ifLabelStack = new Stack<Integer>();
		whileLabelStack = new Stack<Integer>();

		importList.add("java.lang");
		importList.add("java.util");
		importList.add("java.io");
	}
}
