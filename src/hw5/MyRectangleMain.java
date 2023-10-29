package hw5;

public class MyRectangleMain {

	//第四題-印出矩形面積
	public static void main(String[] args) {
		
		MyRectangle mr1=new MyRectangle();
		mr1.setWidth(16);
		mr1.setDepth(25);
		System.out.println(mr1.getArea());
		
		MyRectangle mr2=new MyRectangle(11,11);
		System.out.println(mr2.getArea());
	}

}
