
public class ClassMethod01 {
	public static void main(String[] args) {
		SoccerPlayer01 player01 = new SoccerPlayer01();
		System.out.println(player01.name);
		
		SoccerPlayer01 player02 = new SoccerPlayer01("Saka", "RG");
		System.out.println(player02.name + "は" + player02.position + "でプレーしています");
		
	}
}
