
public class Looping {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("---------");

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        System.out.println("---------");
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }

        // Outer loop
        for (int a = 1; a <= 2; a++) {
            System.out.println("Outer: " + a); // Executes 2 times

            // Inner loop
            for (int b = 1; b <= 3; b++) {
                System.out.println(" Inner: " + b); // Executes 6 times (2 * 3)
            }
        }

    }
}
