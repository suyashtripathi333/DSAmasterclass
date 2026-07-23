package strings;

import java.util.*;

public class Concatenate {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name here");
        String firstName = sc.nextLine();

        System.out.println("Enter your Second name here");
        String SecondName = sc.nextLine(); // nextLine() is used to take a string but if u want you can use next() also but it will take just one word


        System.out.println("Hi "+ firstName + " "+ SecondName + " Welcome to Strings lecture");

    }
}
