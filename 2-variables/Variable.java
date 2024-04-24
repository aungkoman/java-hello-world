
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

        String firstName = "Cisco";
        String lastName = "Ramon";
        String fullName = firstName + lastName;
        System.out.println("Full Name : " + fullName);
        


        // end line spacing
        System.out.println("");

    }
}
