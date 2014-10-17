package pr01.first.steps;

import java.io.PrintWriter;

public class HelloJava4 {

	public static void main(String[] args){
		printGreeting();
	}
	
	public static void printGreeting(){
		PrintWriter pout = new PrintWriter(System.out, true);
		pout.println("Hello Java");
		pout.println("ein Gruss aus dem Package pr1.first.steps");
		pout.println("  aus der Klasse pr1.first.steps.HelloJava4");
		pout.println("    aus der Methode pr1.first.steps.HelloJava4.main()");
		pout.println("jetzt geth's los");
	}
}
