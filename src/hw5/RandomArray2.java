package hw5;

import java.util.Arrays;

public class RandomArray2 {
	
	public int[] notRepeatRandom(int size,int start, int end) {
		int[] array=new int[size];
		int index=0;
		
		while(index<size) {
			array[index]=(int)((Math.random()*(end-start+1))+start);
			for(int i=0;i<index;i++) {
				if(array[index]==array[i]) break;
				if(array[index]!=array[i]) continue;	
			}
			index++;
		}
		return array;
	}
/*************陣列平均*********************************/	
	public double randAvg(int size,int start, int end) {
		int[] array=new int[size];
		int index=0;
		int sum =0;
		
		
		while(index<size) {
			array[index]=(int)((Math.random()*(end-start+1))+start);
			for(int i=0;i<index;i++) {
				if(array[index]==array[i]) break;
				if(array[index]!=array[i]) {
					continue;	
				}
			}
			sum+=array[index];
			index++;
		}
		printArray(array);//印出亂數陣列
		double avg =sum/array.length;
		return avg;//回傳平均值
		
	}
	
	
	
/*****印出陣列*****************************************/
	public void printArray(int array[]) {
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public void printArray(char array[]) {
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+"");
		}
	}
/**********************************************/
	public void genAuthCode() {
		char[] code =new char[8];
		String table="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		System.out.println("本次隨機產生驗證碼為:");
		for(int i=0;i<code.length;i++) {
			code[i]=table.charAt((int)(Math.random()*table.length()));
		}
		
		printArray(code);
	}
	
	
	
	
	
	
}
