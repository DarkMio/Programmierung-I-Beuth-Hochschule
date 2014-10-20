package pr01.ue02;

import java.io.PrintWriter;

public class HelloNumbers {
	
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out, true);
		
		someWhileLoops(out);
		
		for(int x = 0; x <= 10; x++){
			someExpressions(x, out);
		}
	}
	
	public static void someWhileLoops(PrintWriter out){
		int x = 7;
		while (x > 0) {
			out.print(", x: " + x);
			x /= 2;
		}
		out.println(" ***");
		
		
		x = 19;
		while (x > 8) {
			out.print("x: " + x);
			x--;
			x = x + 3;
			x /= 2;
			x = x +3;
		}
		out.println("b b b\n");
	}
	
	public static void someExpressions(double x, PrintWriter out){
		out.println("For x = " + x + ":");
		out.println("\t7^x: " + Math.pow(7, x));
		out.println("\t7^(x+3): " + Math.pow(7, x+3));
		out.println("\tx^9^3: " + Math.pow(x, Math.pow(9, 3)));
		out.println("\te^x+sin(x)+x^(1/2): " + Math.exp(x) + Math.sin(x) + Math.sqrt(x) + "\n");
	}
}
