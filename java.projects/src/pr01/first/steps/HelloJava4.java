package pr01.first.steps;

import java.io.PrintWriter;

public class HelloJava4 {

	public static void main(String[] args){
		printGreeting();
	}
	
	public static void printGreeting(){
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("Hello Java");
		out.println("ein Gruss aus dem Package pr1.first.steps");
		out.println("  aus der Klasse pr1.first.steps.HelloJava4");
		out.println("    aus der Methode pr1.first.steps.HelloJava4.main()");
		out.println("jetzt geth's los");
	}
}
