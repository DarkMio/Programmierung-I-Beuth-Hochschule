package a01;

import java.io.PrintWriter;

public class ManyMethods {

	public static void main(String[] args){
		alphabet();
	}
	
	
	public static void alphabet(){
		PrintWriter out = new PrintWriter(System.out, true);
		for(char zeichen = 'a'; zeichen <= 'z'; zeichen ++){
			out.print(zeichen);
			if(0 != (zeichen - ('a'-1)) % 9){
				out.print("  ");
			} else {
				out.print("\n");
			}
			
		}
		out.flush();
	}
}
