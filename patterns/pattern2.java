package patterns;
import java.util.*;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		this is right angle pattern here
		
//		now take a row from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows right angle triangle u need");
		int m = sc.nextInt();
		
		// now starting loop 
		
		for(int i=0; i<m;i++) {
			for(int j =0; j<(i+1);j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
