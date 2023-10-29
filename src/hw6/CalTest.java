package hw6;

import java.util.Scanner;//引用Scanner套件路徑

public class CalTest {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);//Scanner建構子
		
		while(true) {//迴圈直到輸入值能計算出結果
			try {//輸入互動與執行計算方法
				System.out.println("請輸入x的值:");
				int x=sc.nextInt();
				System.out.println("請輸入y的值:");
				int y=sc.nextInt();
				
				new Calculator(x,y);//執行計算方法
				break; //計算成功跳出迴圈，結束程式
				
			}catch(IllegalArgumentException e1) {//接型別錯誤例外
				System.out.println("輸入格式不正確，請輸入整數");
				continue;//重跑迴圈重新輸入
				
			}catch(CalException e2) {//接計算例外
				System.out.println(e2.getMessage());//印出例外資訊
//				e2.printStackTrace();
				continue;//重跑迴圈重新輸入
				
			}catch(Exception e3) {continue;}//其他例外，重跑迴圈			
		}
			
	}
}
