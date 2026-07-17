package patterns;
import java.util.*;
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of rows here");
		int n =sc.nextInt();
		
		
//		
		for(int i =1; i<=n;i++) {
			//this for loop is  for space n-row
			for(int j =1; j<=(n-i);j++) {
				System.out.print(" ");
			}
			// for printing stars
			for(int j =0; j<=n; j++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
		

	}

}
