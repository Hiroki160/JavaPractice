package extend.animal;

public class Dog extends Animal {
	public Dog() {
		this.name = "犬";
	}
	
	public void cry() {
		System.out.println(this.name + "が泣きました");
	}

}
