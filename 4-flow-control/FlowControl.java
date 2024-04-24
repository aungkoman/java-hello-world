public class FlowControl {
    public static void main(String[] args) {

        System.out.println("");
        /*
         * if (condition) {
         * // block of code to be executed if the condition is true
         * }
         */
        if (true) {
            System.out.println("if statement is true");
        }

        if (8 > 5) {
            System.out.println("8 is greater than 5");
        } else {
            System.out.println("condition is false");
        }

        /*
         * switch(expression) {
         * case x:
         * // code block
         * break;
         * case y:
         * // code block
         * break;
         * default:
         * // code block
         * }
         */

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // Outputs "Thursday" (day 4)

        System.out.println("");
    }
}
