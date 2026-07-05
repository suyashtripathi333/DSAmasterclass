package luv_babbar;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Day name here ");
		String Day = sc.nextLine();
		
		
		switch(Day) {
		case "Monday":
			System.out.println("Ah its first day of the week ");
			break;
		case "Tuesday":
			System.out.println("Ah its Second day of the week ");
			break;
		case "Wednesday":
			System.out.println("Ah its third day of the week ");
			break;
		case "Thursday":
			System.out.println("Ah its fourth day of the week ");
			break;
		case "Friday":
			System.out.println("Ah its fifth day of the week ");
			break;
		case "Saturday":
			System.out.println("Ah its Sixth day of the week ");
			break;
		default:
			System.out.println("Hi its weekend and have fun ");
		
		}

	}

}
