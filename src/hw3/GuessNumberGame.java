package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {

		//產生亂數答案
		System.out.println("開始猜數字吧!");
		int answer = (int)(Math.random()*10);
		int numTimes=0;//計次初始值
		
		//存放歷史數字紀錄空間
		int[] keyinMemory=new int[100];//空間要如何優化?
		
		//使用者互動
		//迴圈判斷式
		while(true) {
			Scanner sc =new Scanner(System.in);
			int guessNumber = sc.nextInt();
			
			Arrays.sort(keyinMemory);//比對是否重複輸入同樣的值
			if(Arrays.binarySearch(keyinMemory,guessNumber)>0) {
				System.out.println("你是金魚嗎?這數字猜過了!");
			}
						
			//紀錄歷史輸入值
			keyinMemory[numTimes]=guessNumber;
			//猜了第幾次
			numTimes++;
			
			//比對答案判斷式
			if(guessNumber==answer) {
				System.out.println("猜對了!答案就是"+answer);
				break;
			}else if(guessNumber>answer) {
				System.out.println("大於正確答案，超遜的!");
			}else if(guessNumber<answer) {
				System.out.println("小於正確答案，用腦子!");
			}
			
			
			
		}
		
		System.out.println("你猜了"+ numTimes+"次!");
		
	}

}
