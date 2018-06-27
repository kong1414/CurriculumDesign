package shopping;

public class Goods {
	private String name;// 名字
	private int num;// 数量
	private double price;// 单价
	private double sum;// 价格

	public Goods(String name, int num, double price) {
		this.name = name;
		this.num = num;
		this.price = price;
		this.sum = num * price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSum() {
		return this.sum;
	}

	public String toString() {
		return getName() + " " + getNum() + " 斤 ， 单价：" + getPrice() + " 元，总价：" + getSum() + " 元";
	}
}
