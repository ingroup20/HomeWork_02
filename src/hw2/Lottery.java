package hw2;

public class Lottery {
	public static void main(String[] args) {
		/*
		 * 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。 
		 * 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		 */

		int num10 = 0,n=0;
		while (num10 < 5) {
			for (int num1 = 1; num1 <= 9; num1++) {
				if (num10 != 4 && num1 != 4) {
					System.out.print(num10 + "" + num1 + " ");
					n+=1;
				}
			}
			System.out.println();
			num10++;
		}
		System.out.print("可選數字共 "+n+" 個");
	}
}
