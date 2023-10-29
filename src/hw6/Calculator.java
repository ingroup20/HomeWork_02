package hw6;

public class Calculator {
	private int x,y;//x、y實體變數
		
	public void setX(int x) {//實體變數給值方法
		this.x=x;//更新實體變數的值
	}
	
	public void setY(int y)  {//實體變數給值方法
		this.y=y;//更新實體變數的值
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
	public Calculator() {//保留空參數建構子
		
	}
	
	public Calculator(int x,int y) throws CalException{//整數參數建構子，發生例外時歸自訂義的計算例外
		setX(x);//更新實體變數的值
		setY(y);//更新實體變數的值
		
		//x的y次方運算
		if(x==0&&y==0) {
			throw new CalException("0的0次方沒有意義!");//符合則丟給計算例外物件(字串參數)處理
		}else if (y<0) {
			throw new CalException("次方為負數，結果回傳不為整數!");//符合則丟給計算例外物件(字串參數)處理
		}else {
			
			//沒例外執行計算
			int answer=1;
			for(int i=1;i<=y;i++) answer*=x;//x的y次方迴圈計算
			assert answer>=0; //檢查結果合理性
			System.out.println(x+"的"+y+"次方等於"+answer);//顯示結果
		}
	}
}
