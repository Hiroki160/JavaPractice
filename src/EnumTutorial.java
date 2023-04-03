
public class EnumTutorial {
	public static void main(String[] args) {
		DaysOfTheWeek days = DaysOfTheWeek.THURSDAY;
		
		if(days == DaysOfTheWeek.FRIDAY) {
			System.out.println("Can't believe it's still Wednesday!!");
		} else {
			System.out.println("Holly shit, I don't wanna work");
		}
	}


}
