package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {
	public static void main(String[] args) {
		Train t1=new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2=new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3=new Train(118, "自強", "高雄", "台北", 500);
		Train t4=new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5=new Train(122, "自強", "台中", "花蓮", 600);
		Train t6=new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7=new Train(1254, "區間", "屏東", "基隆", 700);

		//不重複，override equals()和hashcode()方法
		Set<Train> trainTable = new HashSet<Train>();
		trainTable.add(t1);
		trainTable.add(t2);
		trainTable.add(t3);
		trainTable.add(t4);
		trainTable.add(t5);
		trainTable.add(t6);
		trainTable.add(t7);

		//迭代器		
		Iterator<Train> it=trainTable.iterator();//為何不能用Object型別?
		while(it.hasNext()) {
			Train tt=it.next();//next()不能重複出現，同一回圈內每出現一次就自動下一元素
			System.out.print("班次:"+tt.getNumber()+" ");
			System.out.print(tt.getType()+" ");
			System.out.print("出發地:"+tt.getStart()+" ");
			System.out.print("目的地:"+tt.getDest()+" ");
			System.out.print("票價:"+tt.getPrice()+"\n");
		}
		
		System.out.println("=================================================");
		
		//list排序，可以重複
		List<Train> trainTable1 = new ArrayList<Train>();
		trainTable1.add(t1);
		trainTable1.add(t2);
		trainTable1.add(t3);
		trainTable1.add(t4);
		trainTable1.add(t5);
		trainTable1.add(t6);
		trainTable1.add(t7);
		
		
		for(int i=0;i<trainTable1.size();i++) {//從頭依序取值
			Train tt1=trainTable1.get(i);//第三方物件，用來交換大小位置
			for(int y=i;y<trainTable1.size();y++) {//從取值的下一位依序比較
				if(trainTable1.get(i).getNumber()>trainTable1.get(y).getNumber()) {//取出較小的值
					tt1=trainTable1.get(y);	//小值給tt1
					trainTable1.set(y, trainTable1.get(i));//原值覆蓋比較值的位置
					trainTable1.set(i, tt1);//小值覆蓋原值位置
				}
			}
			System.out.print("班次:"+tt1.getNumber()+" ");
			System.out.print(tt1.getType()+" ");
			System.out.print("出發地:"+tt1.getStart()+" ");
			System.out.print("目的地:"+tt1.getDest()+" ");
			System.out.print("票價:"+tt1.getPrice()+"\n");	
		}
		
		System.out.println("=================================================");		
		
		
		//排序不重複，override compareTo()
		Set<Train> trainTable2 = new TreeSet<Train>();//假如元素用HashSet給TreeSet則無法排序
		trainTable2.add(t1);
		trainTable2.add(t2);
		trainTable2.add(t3);
		trainTable2.add(t4);
		trainTable2.add(t5);
		trainTable2.add(t6);
		trainTable2.add(t7);
		
		
		for(Train tt2:trainTable2) {
			System.out.print("班次:"+tt2.getNumber()+" ");
			System.out.print(tt2.getType()+" ");
			System.out.print("出發地:"+tt2.getStart()+" ");
			System.out.print("目的地:"+tt2.getDest()+" ");
			System.out.print("票價:"+tt2.getPrice()+"\n");
		}
	}
}
