package hw4;

import java.util.Scanner;

public class BorrowMoney {
	//同事人數+同事身上金額的二維陣列

	
	
	//欲借金額
	private int borrow=0;//欲借金額初始值
	//設定欲借金額
	public int setBorrow(int money){
		if(money>=0) borrow=money;//更新欲借金額
		return borrow;//回傳欲借金額
	}
	

	//比對金額
	public void canBorrow(int[] people, int[] peopleMoney,int iNeed) {
//		boolean[] whoHaveMoney=new boolean[5];	//紀錄可借人頭位置
		int countRichMan=0;
		System.out.print("有錢可借的員工編號: ");
		for(int i=0;i<5;i++) {
			if(iNeed<=peopleMoney[i]) {//比對金額
				System.out.print(people[i]+" ");
				countRichMan++;
			}
		}
		System.out.print("共"+countRichMan+"人!");
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("好心人請借我$$，請輸入金額:");
		int needMoney=sc.nextInt();
	
		int[][] colleague= 
			{
					{25  ,32 ,8  ,19  ,27},//員工編號
					{2500,800,500,1000,1200}//持有金額
			};
		
		BorrowMoney firstTime =new BorrowMoney();
		
		firstTime.setBorrow(needMoney);
		firstTime.canBorrow(colleague[0],colleague[1],firstTime.borrow);
	
	}
	
}
