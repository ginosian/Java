/**
 * Created by Martha on 22.10.14.
 */
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
         /**
             * char char.At (int index)
         */
        int index = 6;
       char result = string1.charAt(index);
        System.out.println("The string 1 contains \'\'" + string1 + "\'\'" );
        System.out.println("The string 2 contains \'\'" + string2 + "\'\'" );
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



    }
}
