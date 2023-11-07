package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadTxt {
		
/*請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料*/
	
	public static void main(String[] args) {
		
		File f1 =new File("C:/CHA104_WorkSpace/HomeWork_02/Sample.txt");//檔案物件路徑
		System.out.println("Sample.txt檔案共有\n"+f1.length()+"個位元組");//查詢檔案大小
		
		
		int charCount=0;//字元數初始化
		int lineCount=0;//列數初始化
		
		try {//傳輸例外捕捉
			FileReader fr1 =new FileReader("C:/CHA104_WorkSpace/HomeWork_02/Sample.txt");//檔案字元讀取
			BufferedReader br1 = new BufferedReader(fr1);//字元讀取緩衝區
		 
			 String str;//空字串
			 while ((str = br1.readLine()) != null) {//自動指定字串到str，null時停止
				 
				 lineCount++;//累計放入計次字串
				 charCount+=str.length();//每次字串字元數累計
				 
				 				
					
			 }
			 System.out.println(charCount+"個字元");//印出
			 System.out.println(lineCount+"列資料");//印出
			
			 
			 
			 
			 
			 
			 br1.close();
			 fr1.close();
			 
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}
		
		
		
		
	}

}
