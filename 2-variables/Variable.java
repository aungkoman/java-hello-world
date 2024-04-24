
public class Variable {
    public static void main(String[] args) {
        // Variable declaration syntax
        // type variableName = value;

        // start line spacing
        System.out.println("");
        /*
         * String - stores text, such as "Hello". String values are surrounded by double
         * quotes
         * int - stores integers (whole numbers), without decimals, such as 123 or -123
         * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
         * char - stores single characters, such as 'a' or 'B'. Char values are
         * surrounded by single quotes
         * boolean - stores values with two states: true or false
         */
        String name = "Cisco Ramon";
        System.out.println(name);

        int age = 45;
        System.out.println(age);

        // variable types
        int myNum = 5;
        float myFloatNum = 5.99f;
        double myDoubleNum = 5.89;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myDoubleNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        // variable without value
        float myWeight;
        myWeight = 155.5f;
        System.out.println(myWeight);

        // override value
        myWeight = 160.3f;
        System.out.println(myWeight);

        System.out.println("Current Weight " + myWeight);
        // don't allow override
        final int birthYear = 1990;
        // birthYear = 1995; // it does not allow

        // String concatenation

        String firstName = "Cisco";
        String lastName = "Ramon";
        String fullName = firstName + lastName;
        System.out.println("Full Name : " + fullName);

        int x = 3;
        int y = 5;
        int z = x + y;
        System.out.println("z is " + z);

        // multiple variables in one line
        int a = 5, b = 6, c = 50;
        int d, e, f;
        d = e = f = 4;

        /*
         * The general rules for naming variables are:
         * 
         * Names can contain letters, digits, underscores, and dollar signs
         * Names must begin with a letter
         * Names should start with a lowercase letter, and cannot contain whitespace
         * Names can also begin with $ and _ (but we will not use it in this tutorial)
         * Names are case-sensitive ("myVar" and "myvar" are different variables)
         * Reserved words (like Java keywords, such as int or boolean) cannot be used as
         * names
         * 
         */

        /*
         * 
         * + Addition Adds together two values x + y
         * - Subtraction Subtracts one value from another x - y
         * Multiplication Multiplies two values x * y
         * / Division Divides one value by another x / y
         * % Modulus Returns the division remainder x % y
         * ++ Increment Increases the value of a variable by 1 ++x
         * -- Decrement Decreases the value of a variable by 1 --x
         */

         // comparison, logical operators
         

        // end line spacing
        System.out.println("");

    }
}
