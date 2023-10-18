package hw2;

public class TestNineNine {
	/*
	 * 請建立一個TestNineNine.java程式，可輸出九九乘法 • 一：使用for迴圈 + while迴圈 二：使用for迴圈 + do *
	 * while迴圈 三：使用while迴圈 + do while
	 */
	public static void main(String[] args) {

		// 外層for迴圈縱向-被乘數，內層while迴圈橫向-乘數
		// 一：使用for迴圈 + while迴圈
		for (int y = 1; y <= 9; y++) {
			int x = 1;
			while (x <= 9) {
				System.out.print(y + "*" + x + "=" + y * x + "\t");
				x++;
			}
			System.out.println();
		}

		System.out.println("==============================================");
		// 二：使用for迴圈 + do * while迴圈

		for (int y = 1; y <= 9; y++) {
			int x = 1;

			do {
				System.out.print(y + "*" + x + "=" + y * x + "\t");
				x++;

			} while (x <= 9);

			System.out.println();
		}

		System.out.println("==============================================");
		// 三：使用while迴圈 + do while
		int a = 1;
		while (a <= 9) {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;

			} while (b <= 9);
			a++;
			System.out.println();
		}

	}
}
