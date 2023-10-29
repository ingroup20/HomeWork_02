package hw5;

public class TwoDimensionalArray {

	/***************找出最大值*********************************************/

	public int[] maxElement(int[][] array) {
		int row=0;//橫向紀錄碼
		int column=0;//縱向紀錄碼
		int[] maxNumber= {0,row,column};//紀錄最大數值
		for(int y=0;y<array.length;y++) {//比較數字大小
			for(int x=0;x<array[y].length;x++) {
				if(array[y][x]>maxNumber[0]) {
					maxNumber[0]=array[y][x];//更新最大數值
					row=x;//更新出現位置
					column=y;//更新出現位置
				}
			}
		}
		return maxNumber;
	}

	
	
	
	public double[] maxElement(double[][] array) {
		int row=0;//橫向紀錄碼
		int column=0;//縱向紀錄碼
		double[] maxNumber= {0,row,column};//紀錄最大數值
		for(int y=0;y<array.length;y++) {//比較數字大小
			for(int x=0;x<array[y].length;x++) {
				if(array[y][x]>maxNumber[0]) {
					maxNumber[0]=array[y][x];//更新最大數值
					row=x;//更新出現位置
					column=y;//更新出現位置
				}
			}
		}
		return maxNumber;
	}


}
