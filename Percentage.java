package luv_babbar;
import java.util.*;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Here are your five subject marks input and percentage
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print first Subject marks");
		int firstSubject = sc.nextInt();
		System.out.println("Print second Subject marks");
		int secSubject = sc.nextInt();
		System.out.println("Print third Subject marks");
		int thirdSubject = sc.nextInt();
		System.out.println("Print fourth Subject marks");
		int fourthSubject = sc.nextInt();
		System.out.println("Print fifth Subject marks");
		int fifthSubject = sc.nextInt();
		
		
		
		int percentage = ((firstSubject +  secSubject + thirdSubject + fourthSubject + fifthSubject)/5);
		
		System.out.println(percentage);
	}

}
