package hw8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
	
	public static void main(String[] args) {
		List <Object>manyThings = new ArrayList<>();//List集合，有順序性，元素可以重複
		manyThings.add(new Integer(100));//int物件
		manyThings.add(new Double(3.14));//double物件
		manyThings.add(new Long(21L));//long物件
		manyThings.add(new Short("100"));//short物件
		manyThings.add(new Double(5.1));
		manyThings.add("Kitty");//String物件
		manyThings.add(new Integer(100));
		manyThings.add(new Object());//Object物件
		manyThings.add( "Snoopy");
		manyThings.add(new Integer("1000"));//BisInteger?
		
		/*******用迭代器****/
		Iterator<Object> getList=manyThings.iterator();//產生迭代器
		while(getList.hasNext()) {//迭代器有元素回傳true
			System.out.println(getList.next());//迭代器的下一個元素
		}
				
		/*****for迴圈******/
		System.out.println("---------------------------");
		for(int i=0;i<manyThings.size();i++) {//取得元素個數
			Object obj1=manyThings.get(i);//每輪個別取出元素交給obj1
			System.out.println(obj1);
			
		}
		
		/*******for-each************/
		System.out.println("----------------------------");
		for(Object obj2:manyThings)//集合元素取出型別為"共同父類別"
			System.out.println(obj2);
	}
}
