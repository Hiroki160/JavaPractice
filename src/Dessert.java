
public enum Dessert {
	APPLE(100), CAKE(200), CANDY(100);
	
	private int price;
	
	private Dessert(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
