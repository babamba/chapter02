package chapter02;

public class ArrayUtilTest {
	
	public static void main(String[] args) {
		
		
		int[] arrayInt = {10,20,30,40,50};

		
		
		// int 배열을 double 배열로 변환
		double[] arrayDouble = ArrayUtil.intToDouble(arrayInt);
		for(int i = 0; i < arrayDouble.length; i++){
			System.out.println(arrayDouble[i]);
		}
		
		//double 배열을 int 배열로 변환
		

		double[] doubleInt	= {10.1, 20.2, 30.3, 40.4 ,50.5};
		int[] arrayint = ArrayUtil.doubleToInt(doubleInt);
		
		for(int i : arrayint){
			System.out.println(i);
		}
//		for(int i = 0; i < arrayint.length; i++){
//			System.out.println(arrayint);
//		}
		
		// int 배열 두 개를 연결한 새로운 배열 리턴
		int[] a = {1, 2, 3};
		int[] b = {6, 7, 8};
		
		int[] c = ArrayUtil.concat(a, b);
		for(int i : c){
			System.out.println(i);
		}
		
	}
}
