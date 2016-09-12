package chapter02;

public class Car {
	private int speed;
	protected int accelator;
	
	public void drive(){
		speed = 0;	//private는 내부(본인클래스)에서만 쓸수있다.
	}
}
