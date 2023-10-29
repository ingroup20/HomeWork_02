package hwExt;


public abstract class Hero {

	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	
	
	public abstract void attack();
	
	public void move() {
		System.out.println("跑步");
	}
	
	public void defend() {
		System.out.println("做防禦動作");
	}
	
	
	
}




class SwordMan extends Hero implements BasicActions{
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void attack() {
		System.out.println("揮劍");
	}
	
}


class ArrowMan extends Hero implements BasicActions{
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	@Override
	public void attack() {
		System.out.println("放弓箭");
	}

}