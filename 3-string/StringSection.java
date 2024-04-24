
public class StringSection {
    public static void main(String[] args) {
        System.out.println("");

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String helloString = "Hello World";
        System.out.println(helloString.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(helloString.toLowerCase()); // Outputs "hello world"

        Math.sqrt(64); // 8
        Math.random(); // from 0.0 to 1.0
        int randomNum = (int) (Math.random() * 101); // 0 to 100

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        System.out.println("");
    }
}
