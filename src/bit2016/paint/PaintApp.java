package bit2016.paint;

public class PaintApp {
	public static void main(String[] args) {
		Point point = new Point();	
		point.setX(100);
		point.setY(1000);
		point.show();
		
		Point point2 = new Point(200, 200); //직접 생성자를 통한 객체생성
		point2.show(true);
		
		point2.show(false);
	}
}
