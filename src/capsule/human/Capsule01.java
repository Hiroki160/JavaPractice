package capsule.human;

public class Capsule01 {
	public static void main(String[] args) {
		//カプセル化されていないインスタンスを作成
		HumanNoCapsule human1 = new HumanNoCapsule("千葉", 26);
		//カプセル化されていないので、値を変更できる
		human1.name = "森田";
		human1.age = 23;
		System.out.println(human1.name + "は" + human1.age + "才です");
		
		//カプセル化されたインスタンスを作成
		HumanCapsule human2 = new HumanCapsule("千葉", 46);
		System.out.println(human2.getName() + "は" + human2.getAge() + "です！！");
		//human2.name = "hiro" → privateなので、invisibleになっている
		human2.setName("竹中");
		System.out.println("名前を" + human2.getName() + "に変更しました！");
	}
}
