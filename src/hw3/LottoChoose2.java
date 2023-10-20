package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class LottoChoose2 {
	public static void main(String[] args) {
		// 使用者互動
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字(1~9)?");
		int hateNumber = sc.nextInt();//將討厭的數字給變數

		// 建立本類別物件，呼叫本類別方法
		LottoChoose2 lc = new LottoChoose2();
		lc.canNumber(hateNumber);// 本類別方法:可用數字方法
	}

	// 可用的數字方法:篩選出可用的數字與個數
	public void canNumber(int noUse) {

		// 產生一個足夠大的空陣列
		int[] table = new int[49];

		// 將可用的數字更新至空陣列中
		int count = 0;//可用數字計次用
		for (int i = 1; i <= 49; i++) {//1~49的數字都進行檢查
			if (i % 10 != noUse && (i / 10) != noUse) {//挑出可用的數字
				table[count] = i;// 計次的起始值，剛好與陣列index的起始值一樣都是0
				System.out.print(table[count]+"\t");// 有挑到數字才列印
				count++;// 有挑到可用的數字+1，同時也將table陣列的index往後一位，待放數字
				if (count % 6 == 0)//檢查印了幾次數字了，每六個數字換行
					System.out.println();
			}
			
		}

		System.out.println("可選總數" +  count + "\n");//印出有幾個數=挑出幾次數字

		System.out.print("幸運數字:");
		choose6(table,count);//呼叫選6個數字的方法，放入參數(可用數字陣列，數字總數)

	}

	//選6個數字的方法
	public void choose6(int[] numTable,int index) {
		int[] winChoose = new int[6];//產生一個大小為6，可放入6個隨機索引值的空陣列
		int indexCount=5;//要給winChoose陣列用的位置索引(同時計次)
		while(indexCount>=0){//計次要填滿winChoose陣列的6個位置
			Arrays.sort(winChoose);//陣列排序，讓以前的數字從後面開始填
			int lucktNumber= (int) (Math.random() * index);//可用數字表的個數範圍做亂數，因為亂數是要給別的陣列做索引用，所以剛好0~(最後數-1)
	
			//因亂數可能會重複，要設檢查避開
			if(Arrays.binarySearch(winChoose, lucktNumber)<0){//檢查陣列好無一樣的亂數值
				//陣列排序後，binarySearch本身就有逐一檢查效果
				winChoose[indexCount] =lucktNumber;//檢查後沒重複的數才寫入陣列，位置為當迴圈位置
				indexCount--;//有寫入陣列才算完成1次
			}
		}
		Arrays.sort(winChoose);//陣列排序
		for (int i = 0; i < 6; i++)
			System.out.print(numTable[winChoose[i]] + " ");

	}

}
