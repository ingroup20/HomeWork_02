package hw2;

public class LetterTriangle {
	public static void main(String[] args) {
		/*
		 * A BB CCC .... FFFFF
		 */

		// 印5行
		// A=1,B=2.....
		int letter='A';//char to int
		for (int n = 1; n <= 6; n++) {// 印5行
			for(int m=1;m<=n;m++) {//每行印的次數
				System.out.print((char)letter);
			}
			System.out.println();
			letter++;
		}
		
	}

}
