package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class LottoChoose {
	public static void main(String[] args) {
		//使用者互動
		System.out.println("阿文...請輸入你討厭哪個數字(1~9)?");
		Scanner sc= new Scanner(System.in);
		int hateNumber=sc.nextInt();
		
		//建立物件
		LottoChoose lc=new LottoChoose();
		lc.canNumber(hateNumber);//篩選數字
		
		
		System.out.print("======test*test");
		System.out.print("======test2");
		System.out.print("======test3");
		System.out.print("======test4");
	}
	
	//篩選出可選的數字與個數
	public void canNumber(int noUse) {
		
		//產生一張可選數字的表
		int[] table=new int[49];
		
		//決定表的大小
		int n=0;
		for(int i=1;i<=49;i++) {
			if(i!=noUse && (i/10)!=noUse) {
				table[i-1]=i;//討厭的數字位置值為0
				n++;//可選數量
			}	
		}
		
		Arrays.sort(table);//排序
		table = Arrays.copyOfRange(table ,49-n-1,48);
		

		printArray(table);//列印陣列
		System.out.print("可選總數"+n);
		
	}
	
	//列印陣列方法
	public void printArray(int[] xxx) {
		for(int i=0;i<xxx.length;i++) {		
				if(i%6==0) 
					System.out.println();//每六個數字換行
				
				System.out.print(xxx[i]+"\t");
		}	
	}	
	
	//隨機選六個數字，避免重複
	
	//顯示6個數字
	public void choose6(int[] numTable ) {
		int[] win= new int[6];
		for(int i=0;i<6;i++) {
			win[i]=(int)(Math.random()*numTable.length)+1;
		}
		
	}
	


	
	

	
	
		
}
	
	


