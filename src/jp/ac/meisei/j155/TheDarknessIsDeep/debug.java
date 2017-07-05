package jp.ac.meisei.j155.TheDarknessIsDeep;

public class debug {
	public static boolean flag=true;

	public static void println(String s){
		if(flag) System.out.println(s);
	}
	public static void print(String s){
		if(flag) System.out.print(s);
	}

}
