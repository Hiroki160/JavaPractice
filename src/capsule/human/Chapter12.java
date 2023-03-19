package capsule.human;

public class Chapter12 {
	public static void main(String[] args) {
		CapsuleMan man1 = new CapsuleMan("小林", 32);
		System.out.println(man1.getName() + "は" + man1.getAge() + "才です");
		man1.setAge(33);
		System.out.println("誕生日を迎えたので" + man1.getAge() + "歳になりました");
		man1.setName("珍子");
		System.out.println("離婚したので、苗字が" + man1.getName() + "になりました");
	}

}
