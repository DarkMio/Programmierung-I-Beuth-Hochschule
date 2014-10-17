package pr01.first.steps;

import java.io.PrintWriter;

public class Fakultaet2 {
	
	public static void main(String[] args){
		printFaculties(1, 5);
	}
	
	public static void printFaculties(int startValue, int endValue){
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("****************************");
		out.println("Einige Fakultaeten:");
		out.println("****************************");
		int argument = startValue;
		while (argument <= endValue){
			long fakultaet = fakultaet(argument);
			out.println(argument + "! = " + fakultaet);
			argument += 1;
		}
		out.println("****************************");
	}
	
	public static long fakultaet(int x){
		if(x<0){
			throw new IllegalArgumentException
				("Fakultaetsberechnung NICHT fuer negative Zahlen!");
		}
		long temp = 1;
		while (x > 1){
			temp = temp * x;
			x = x - 1;
		}
		return temp;
	}
}
