package pr01.first.steps;

public class Fakultaet1 {
	
	public static void main(String[] args){
		System.out.println("5! = " + fakultaet(5));
	}
	
	public static long fakultaet(int x){
		long temp = 1;
		while (x > 1){
			temp = temp * x;
			x = x - 1;
		}
		return temp;
	}
}
