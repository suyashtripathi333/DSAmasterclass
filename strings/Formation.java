package strings;

import java.util.*;

public class Formation {

    static void main() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the string here : ");

        //Literal way to form the String -> here the string is save in string pool
        String  name = "Suyash";
        String  naam = "Suyash";

        // forming string using  new keyword
        String str = new String("Suyash");
        String st = new String("Suyash");


        //Now if we compare  literal string here

        if(name==naam){
            System.out.println("This literal method string and they are equal : "+true);

        }
        else{
            System.out.println(false);
        }



        //Now comparing the two  new keyword formed Strings

        if(str==st){
            System.out.println(true);

        }
        else{
            System.out.println(false);//it will be always false here because they two different object and two different memory location
        }

        // but if u put .equals to check if hey are true here
        if(str.equals(st)){
            System.out.println(true);

        }
        else{
            System.out.println(false);
        }



    }
}
