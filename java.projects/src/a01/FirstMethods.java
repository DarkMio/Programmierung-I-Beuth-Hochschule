package a01;

import java.io.PrintWriter;

public class FirstMethods {

	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out, true);
		// Testfunktion fuer printText()
		printText(out, "This is some text.");
		printText(out, "This is some more text.");
		// Das Vierfache von einer Zahl
		printText(out, "Das Vierfache von 4: "
				+ dasVierfacheVon(4));
		printText(out, "Das Vierfache von 100: " +
				+ dasVierfacheVon(100));
		// Maximum von ?
		printText(out, "Die groessere Zahle von 1 & 2 ist " + maximumVon(1, 2));
	}
	
	public static void printText(PrintWriter out, String text){
		out.println(text);
	}
	
	public static double dasVierfacheVon(double x){
		x = x * 4;
		return x;
	}
	
	public static double maximumVon(double a, double b){
		double x = Math.max(a, b);
		return x;
	}
}
