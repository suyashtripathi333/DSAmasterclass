package patterns;
import java.util.*;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("here is the row value");
		int row = sc.nextInt();
		
		for(int i =1 ; i<=row;i++) {
			for(int j = 1; j <= row-(i-1);j++ ) {
				System.out.print(" * ");
			}
			System.out.println();
		}
			
		

	}

}
