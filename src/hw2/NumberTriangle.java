package hw2;

public class NumberTriangle {
	public static void main(String[] args) {
		/* 印出
		 * 1~10
		 * 1~9
		 * ...
		 * 1
		 */
		
		//從10遞減換行
		//印出1~10的數字
		
		for(int n=10;n>0;n--) {
			for(int m=1; m<=n;m++) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}
