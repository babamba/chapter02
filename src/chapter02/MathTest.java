package chapter02;

public class MathTest {
	public static void main(String[] args) {
	
//		Math math = new Math();
//		math.abs(-10)
//		10 <- abs( -10 )
	
//		int i = Math.abs( -10); //절대값	
//		max(10, 20);
		
		int i = Math.abs(-10);
		int j = Math.max(10, 20);
	}
	
	static int max(int i, int j){
		if(i>j){
			return i;
		}
			return j;
	}
	
}
