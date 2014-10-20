package pr01.ue02;

import java.io.PrintWriter;

public class Deklaration01 {
	
	public static void main(String[] args){
		PrintWriter pout = new PrintWriter(System.out, true);
		a("This is some text.", pout);
		b("This is some other text.", pout);
		c("This is some more text.", pout);
	}
	
	public static void a(String text, PrintWriter pout){
		pout.println(text);
	}

	public static void b(String text, PrintWriter pout){
		pout.println(text);
	}

	public static void c(String text, PrintWriter pout){
		pout.println(text);
	}
	
}
