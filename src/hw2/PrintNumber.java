package hw2;

public class PrintNumber {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum2 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1~1000偶數和= " + sum2);

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int multiplyN = 1;
		int i = 1;
		for (; i <= 10; i++) {
			multiplyN *= i;
		}
		System.out.println("1~10的連乘積= " + multiplyN);

		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int multiplyNum = 1;
		int n = 1;
		while (n <= 10) {
			multiplyNum *= n;
			n++;
		}
		System.out.println("1~10的連乘積= " + multiplyNum);

		// 請設計一隻Java程式,輸出結果為以下:
		// 1 4 9 16 25 36 49 64 81 100
		int num = 0,addnum = 1;
		while(addnum<101) {
			if(addnum%2!=0) {
				num+=addnum;
				System.out.print(num+" ");
			}
			if(num>=100) break;
			addnum++;

		}

	}
}
