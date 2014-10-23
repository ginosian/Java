/**
 * Created by Martha on 22.10.14.
 */

/**
 * Variables, Data Types and Simple I/O
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args []){
        /** Math game
         * demonstrates integer math using arithmetic operations
         */
        /*int num1, num2;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.println("First number");
            num1 = Integer.parseInt(reader.readLine());
            System.out.println("Second number");
            num2 = Integer.parseInt(reader.readLine());

       }
       catch (IOException ioe){
        System.out.println("I/O error occurred, using 1    ");
        num1 = num2 = 1;
       }
        catch (NumberFormatException nfe){
            System.out.println("Number format incorrect using 1    ");
            num1 = num2 =1;

        }
        System.out.println(num1 + "+ " + num2 + "= " + (num1+num2));
        System.out.println(num1 + "- " + num2 + "= " + (num1-num2));
        System.out.println(num1 + "/ " + num2 + "= " + (num1/num2));
        System.out.println(num1 + "* " + num2 + "= " + (num1*num2));
        */
        /** Tip calculator
         * Parses user input and floating point math
         */

        /*String costResponse;
        Double tip, meal, total;
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("How mauch was the meal");
        try{
            costResponse = reader.readLine();
            meal = Double.parseDouble(costResponse);
            tip = meal*0.15;
            total = meal + tip;
            System.out.println("The meal cost $" + meal);
            System.out.println("The tip cost $" + tip);
            System.out.println("The total is $" + total);
        }
        catch (IOException ioe){
            System.out.println("I/O Exception");
        }
        */

        /**
         * Hello Arg
         * uses command line argument
         */
        /*
        for (int i = 0; i<args.length; i++)
        {
            System.out.println("Hell " + args[i] + "!" );
        }
        */
        String string1 = " Once upon a time ";
        String string2 = " To be or not to be ";
        String string3 = "time ";
        String string4 = string1;
        String string5 = " once Upon a Time ";
        String string6 = "be";

        System.out.println("The string 1 contains \'\'" + string1 + "\'\'" );
        System.out.println("The string 2 contains \'\'" + string2 + "\'\'" );
        System.out.println("The string 3 contains \'\'" + string3 + "\'\'" );
        System.out.println("The string 4 contains \'\'" + string4 + "\'\'" );
        System.out.println("The string 5 contains \'\'" + string5 + "\'\'" );
        System.out.println("The string 6 contains \'\'" + string6 + "\'\'" );


         /**
             * char char.At (int index)
         */
        int index = 6;
        char result = string1.charAt(index);
        System.out.print("charAt " + "= " + result);
        System.out.println();
        /**
         * STring concat(String str)
         */
        String concat = string1.concat(string2);
        System.out.print("concat " + "= " + concat);
        System.out.println();
        /**
         * Boolean endsWith (String str)
         */
        Boolean endsWith = string1.endsWith(string3);
        System.out.print("endsWith " + "= " + endsWith);
        System.out.println();
        /**
         * Boolean equals (String str)
         */
        Boolean equals = string4.equals(string1);
        System.out.print("equals " + "= " + equals);
        System.out.println();
        /**
         * Boolean equalsIgnoreCase (String str)
         */
        Boolean equalsIgnoreCase = string1.equalsIgnoreCase(string5);
        System.out.print("equalsIgnoreCase " + "= " + equalsIgnoreCase);
        System.out.println();
        /**
         * int indexOf (char c)
         */
        char indexOf = 'e';
        int iOf = string1.indexOf(indexOf);
        System.out.print("indexOf " + indexOf + " " + "= " + iOf);
        System.out.println();
        /**
         * int indexOf(char c, int p)
         */
        int iof2 = string1.indexOf(indexOf, index);
        System.out.print("index of " + indexOf + " starting from " + (iOf + 1) +  " position " + "= " + iof2);
        System.out.println();
        /**
         * int indexOf (String str)
         */
        int iof3 = string1.indexOf(string3);
        System.out.print("index of " + string3 +  " is at position " + "= " + iof3);
        System.out.println();
        /**
         * int indexOf (String str, int p)
         */
        int iOf5 = 6;
        int iof4 = string2.indexOf(string6, iOf5);
        System.out.print("index of " + string6 + " starting from " + (iOf5 + 1) +  " is at position " + "= " + iof4);
        System.out.println();
        /**
         * int length ()
         */
        int lngth = string1.length();
        System.out.print("The length of " + string1 + " = " + lngth);
        System.out.println();
        /**
         * String replace (char c1, char c2)
         */
        char r1 = 'a';
        char r2 = 'A';
        String replace = string1.replace(r1, r2);
        System.out.print("The replaced string1 " + " = " + replace);
        System.out.println();
        /**
         * String substring (int n1, int n2)
         */
        int n1 = 4;
        int n2 = 11;
        String subString = string1.substring(n1, n2);
        System.out.print("The substring string1 " + " = " + subString);
        System.out.println();
        /**
         * String toLowerCase ()
         */
        String lowerCase = string1.toLowerCase();
        System.out.print("The lowerCased string1 " + " = " + lowerCase);
        System.out.println();
        /**
         * String toUpperCase ()
         */
        String upperCase = string1.toUpperCase();
        System.out.print("The upperCased string1 " + " = " + upperCase);
        System.out.println();
        /**
         * String valueOf()
         */
        double a = 569785.2654965;
        Boolean b = false;
        System.out.println("The value of double " + " = " + String.valueOf(a));
        System.out.println("The value of Boolean " + " = " + String.valueOf(b));
        String testing = String.valueOf(a);
        System.out.println("ValueOf testing " + " = " + testing);

        /**
         * NameGame
         * Demonstrates simple I/O and String Methods
         */
        String firstName = "";
        String lastName = "";
        String fullName;
        String initials;
        int numLetters;
        System.out.println("What is your first name?");
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try {
            firstName = reader.readLine();
        }
        catch(Exception ioe){
            System.out.println("I/O Exception occurred");
        }
        System.out.println("Nice name " + firstName + " , I'll shot it " + firstName.toUpperCase() + "!");
        System.out.println("What is your last name?");
        try{
            lastName = reader.readLine();
        }
        catch (Exception ioe){
            System.out.println("I/O Exception occurred");
        }
        fullName = firstName.concat(" ").concat(lastName);

        System.out.println("So your full name is " + fullName + "!");
        initials = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
        System.out.println("Your initials are " + initials + " !");
        numLetters = firstName.length() + lastName.length();
        System.out.println("There are " + numLetters + " letters in your full name");

        System.out.println("The end of paragraph");



    }
}
