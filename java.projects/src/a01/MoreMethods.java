package a01;

import java.io.PrintWriter;

public class MoreMethods {
	
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out, true);
		
		spacer();
		printDreieck(out, "X", 5);
		
		spacer();
		printXQuadrat(out, 4);
		
		spacer();
		printSqrt(out, 4);
		
		spacer();
	}
	
	public static void spacer(){ System.out.println("*******************"); }
	
	public static void printDreieck(PrintWriter out,
			String letter, int row){
		
		out.println("This is a triangle:");
		
		for(int x = 0; x < row; x++){
			
			for(int y = 0; y <= x; y++){
				out.print(letter);
			}
			out.println();
		}
	}
	
	public static void printXQuadrat(PrintWriter out, int maxX){
		
		int val;
		
		for(int x = 1; x <= maxX; x++){
			val = x*x;
			out.println("Das Quadrat von " + x + " betraegt " + val);
		}
	}
	
	public static void printSqrt(PrintWriter out, int maxX){
		double val;
		for(int x = 1; x <= maxX; x++){
			val = Math.sqrt(x);
			out.println("Die Wurzel von " + x + " betraegt " + val);
		}
	}
}
