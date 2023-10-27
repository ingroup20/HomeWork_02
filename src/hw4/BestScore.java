package hw4;

import java.util.Scanner;
import java.util.Arrays;

public class BestScore {
	
	//現有資料//學生與成績列表
	static String[] student= 
		{"1號", "2號", "3號", "4號", "5號", "6號", "7號", "8號"};
	//初始成績
	static int[][] studentScore = new int[6][8];
	//初始累計最高分學生
	 int[] bestSudentTable= new int[8];
			
//*************可擴充考試陣列*************************************
	
	public int[][] expandTable(int addExamTimes){
			
		Scanner sc1 =new Scanner(System.in);
		//擴充陣列
		int[][] scoreTable=new int[6+addExamTimes][8];
		//呼叫其他物件方法
		ArrayAvgMax aa=new ArrayAvgMax();
		System.out.println("請登入考試成績");
		
			
		for(int add=1;add<=addExamTimes;add++) {//分場考試加入
			for(int i=0;i<student.length;i++) {//學生成績依序填入
				System.out.print(student[i]+": ");
				int score =sc1.nextInt();//輸入互動
				scoreTable[studentScore.length-1+add][i]=score;
			}
		}
			
		//複製舊有成績表
		
		for(int y=0;y<studentScore.length;y++) {//場次
			for(int x=0;x<student.length;x++) {//成績依序填入
				scoreTable[y][x]=studentScore[y][x];
			}
		}	
		
		
		return studentScore=scoreTable;
	}
		
	
//*********取出陣列最高成績，傳回***********************************
	public int bestScore(int[] exam) {
		int[] getHighest=Arrays.copyOf(exam, exam.length);
		Arrays.sort(getHighest);
		int score=getHighest[getHighest.length-1];
		return score;
	}
	
	//陣列最高成績，回查學生
	public int[] greatStudents(int[] exam,int indexScore) {

		for(int i=0;i<exam.length;i++) {
			if(exam[i]==indexScore) 
				bestSudentTable[i]++;	//索引位置，符合的學生+1
		}
		return bestSudentTable;
	}
		
	
	 
/****ENTRANCE***************************************************************/	
	public static void main(String[] args) {
		//成績初始化
		studentScore[0]= new int[]{10, 35, 40, 100, 90, 85, 75, 70};
		studentScore[1]= new int[]{37, 75, 77, 89, 64 ,75, 70, 95};
		studentScore[2]= new int[]{100, 70, 79, 90, 75, 70, 79, 90};
		studentScore[3]= new int[]{77, 95, 70, 89, 60, 75, 85, 89};
		studentScore[4]= new int[]{98, 70, 89, 90, 75, 90, 89, 90};
		studentScore[5]= new int[]{90, 80, 100, 75, 50, 20, 99, 75};
			
			
		//呼叫輸入功能物件
		Scanner sc =new Scanner(System.in);
		//載入成績分析物件
		BestScore bs=new BestScore();
			
		//使用者互動輸入
		//取得考試成績紀錄
		
			System.out.println("要新增幾場考試紀錄?");
			int addExam=sc.nextInt();
			bs.expandTable(addExam);
		
			
		for(int i=0;i<studentScore.length;i++) {
			bs.greatStudents(studentScore[i],bs.bestScore(studentScore[i]));
		}
		
		//呼叫其他物件方法
		
		System.out.println("每位同學考最高分的次數:");
		System.out.println("=================================");
		ArrayAvgMax aa1=new ArrayAvgMax();
		aa1.printArray(student,student.length);
		aa1.printArray(bs.bestSudentTable,8);	
	}
		
		
			

}
