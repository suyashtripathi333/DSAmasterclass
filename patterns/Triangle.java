package patterns;
import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("here input for the row");
		int row = sc.nextInt();
		
		
		
		for(int i = 1; i<= row; i++) {
			
			for(int j = 0; j<=(row-i);j++) {
				System.out.print("   ");
			}
			
			for(int j =1; j<=((2*i)+1)-2;j++) {
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
		

	}

}
