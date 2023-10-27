package hw4;

import java.util.Scanner;

public class DayOfThisYear {
	/*
	 * • 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
	 * 
	 * 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
	 * 
	 */

	// 使用者輸入日期(可複用method)
	// 檢查輸入年月日數字大小規則
	public void checkDate(int[] date) {

		if (date[0] > 9999 || date[0] < 0) {// 基本輸入檢查
			System.out.println("西元年格式，輸入錯誤!");
		} else if (date[1] > 12 || date[1] < 0) {
			System.out.println("月份格式，輸入錯誤!");
		} else if (date[1] == 2 && date[2] > 29) { // 2月天檢查
			System.out.println("日格式，輸入錯誤!");
		} else if (date[2] > 31 || date[2] < 0) {
			System.out.println("日格式，輸入錯誤!");
		} else
			calculateDays(date);

	}

	public boolean leapYear(int year) {
		boolean isLeapYear = false;
		if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0)
			isLeapYear = true;
		return isLeapYear;
	}

	public void calculateDays(int[] date) {
		int days = date[2];

		switch (date[1] - 1) {// 判斷月份
		case (12): // 前月天數累加
		case (11):
			days += 30;
		case (10):
			days += 31;
		case (9):
			days += 30;
		case (8):
			days += 31;
		case (7):
			days += 31;
		case (6):
			days += 30;
		case (5):
			days += 31;
		case (4):
			days += 30;
		case (3):
			days += 31;
		case (2):// 判斷閏年
			if (leapYear(date[0])) {
				days += 29;
			} else
				days += 28;
		case (1):
			days += 31;
		}

		System.out.print("輸入的日期為該年第" + days + "天");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入西元yyyy年mm月dd日");
		int[] date = new int[3];
		System.out.print("yyyy年:");
		date[0] = sc.nextInt();
		System.out.print("mm月:");
		date[1] = sc.nextInt();
		System.out.print("dd日:");
		date[2] = sc.nextInt();

		DayOfThisYear dy1 = new DayOfThisYear();
		dy1.checkDate(date);
	}

}
