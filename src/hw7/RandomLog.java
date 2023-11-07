package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import hw5.RandomArray2;

public class RandomLog {

	public static void main(String[] args) {
		
		/****第二題******/
		/*請寫一隻程式,能夠亂數產生10個1~1000的整數,
		 * 並寫入一個名為Data.txt的檔案裡 
		 * (請使用append功能讓每次執行結果都能被保存起來)
		 */
		
		File data =new File("C:\\CHA104_WorkSpace\\HomeWork_02\\Data.txt");	//文件路徑	
		if (!data.exists()) {//檢查文件是否已存在
			try {
				data.createNewFile();//不在則新建文件
			}catch(IOException e) {//捕捉無法新建的例外
				
			}
		}
		
		
		try {
			FileOutputStream fos=new FileOutputStream(data,true);//低階寫入類別
			BufferedOutputStream bos =new BufferedOutputStream(fos);//高階緩衝類別
			
			
			int[] arr=new int[10];//空陣列，提升閱讀性
			RandomArray2 randomArray10Number=new RandomArray2();//引用hw5的類別，產生物件
			arr= randomArray10Number.notRepeatRandom(10,1,1000);//物件方法
			
			PrintStream ps = new PrintStream(bos);//高階寫入類別
			
			for(int i=0;i<arr.length;i++)//迴圈將陣列元素逐一寫入
				ps.print(arr[i]+"  ");//寫入
		
			ps.print("\n");//寫入換行
			
			ps.close();//關閉資訊流
			bos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {//低階類別例外
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		
		
		
	}
}
