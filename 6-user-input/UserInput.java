import java.util.Scanner;  // Import the Scanner class

class UserInput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What is your name ?");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Hello " + userName);  // Output user input

    myObj.close();
  }
}