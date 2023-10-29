package hwExt;

public abstract class Pen {

	protected String brand;
	protected double price;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	public abstract void write(); 
	
/****************************************************/
	public Pen() {
		
	}
	
	public Pen(String brand,double price) {
		setBrand(brand);
		setPrice(price);
	}
	
	public Pen(String brand) {
		setBrand(brand);
		setPrice(10);
	}
	
	public Pen(double price) {
		setBrand("傻筆");
		setPrice(price);
	}
	

	

}

/*Pen子類別**********************************************/

class Pencil extends Pen {
	
	public Pencil() {
	};
	
	
	public Pencil(String brand,int price) {
		super(brand,price*0.8);
	};
	
	public Pencil(int price) {
		super(price*0.8);
	};
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
}



class InkBrush extends Pen {

	public InkBrush(String brand,int price) {
		super(brand,price*0.9);
	};
	
	public InkBrush(int price) {
		super(price*0.9);
	};
	
	

	public void write() {
		System.out.println("沾墨汁再寫");
	}
}