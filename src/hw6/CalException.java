package hw6;

public class CalException extends Exception{//自訂義計算例外繼承例外父類別

	public  CalException() {//保留空參數建構子
		super();//可不寫，系統自己會加入
	}
	
	public  CalException(String msg) {//呼叫計算例外，傳入文字時
		super(msg);//將文字覆寫給例外父類別
		
	}
}
