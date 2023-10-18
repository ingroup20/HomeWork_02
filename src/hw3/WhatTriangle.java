package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class WhatTriangle {
	public static void main(String[] args) {

		// 使用者互動
		System.out.println("請輸入三個整數:");
		Scanner sc = new Scanner(System.in);
		int aSide = sc.nextInt();
		int bSide = sc.nextInt();
		int cSide = sc.nextInt();
		int[] triSide = { aSide, bSide, cSide };// 放入陣列
		// 三邊長排序，小到大
		Arrays.sort(triSide);

		// 創建物件實體F
		WhatTriangle wt = new WhatTriangle();
		// 呼叫判定方法
		wt.triangleID(triSide[0], triSide[1], triSide[2]);

	}

	// 三角形判定方法
	public void triangleID(double a, double b, double c) {
		if (a == 0 || b == 0 || c == 0) {
			System.out.print("不是三角形");

		} else if (a == b && b == c) {
			System.out.print("正三角形");

			
		}else if ((c * c == a * a + b * b)&& a==b) {
			System.out.print("等腰直角三角形");
			

		}else if (c * c == a * a + b * b) {
			System.out.print("直角三角形");
			

		} else if (a == b || b == c || c == a) {
			System.out.print("等腰三角形");


		} else {
			System.out.print("其他三角形");
		}

	}

}
