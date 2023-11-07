package hw8;

public class Train implements Comparable<Train>{
	private int number;//班次 
	private String type;//車種
	private String start;//出發地 
	private String dest;//目的地
	private double price;//票價
	
	public void setNumber(int number) { this.number=number;}
	public void setType(String type) {this.type=type;}
	public void setStart(String start) {this.start=start;}	
	public void setDest(String dest) {this.dest=dest;}
	public void setPrice(double price) {this.price=price;}
	
	public int getNumber() {return number;}
	public String getType() {return type;}
	public String getStart() {return start;}
	public String getDest() {return dest;}
	public double getPrice() {return price;}
	
	
	public Train() {
	
	}
	
	public Train(int number, String type, String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj != null && this.getClass() == obj.getClass()) {
			Train t = (Train) obj;
			if (this.number == t.number && this.start.equals(t.start)&& this.dest.equals(t.dest)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		final int prime =31;
		int result=1;
		result=result*prime+number;
		result=result*prime+(int)price;
		
		return 0;
	}
//	
//	
//	
	
	
	
	
	
	
	//排序不重複條件
	public int compareTo(Train aTrain) {
		// 物件本身與 aTrain 相比較，如果 return 正值，就表示比 aTrain 大
		if (this.number > aTrain.number) {
			return 1;// 升(降)冪規則
		} else if(this.number == aTrain.number) {
			return 0;//TreeSet要用的<剔除重複資料>
		}else {
			return -1;// 升(降冪規則
		}
		// 用正負值代表兩者的"左右"關係
	}

}
