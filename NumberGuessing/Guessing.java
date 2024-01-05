import java.util.Scanner;
import java.util.Random;

public class Guessing {
  public static void main(String[] args) {
    System.out.println("Imagine a number between [0, 100) in your mind, and I will guess it.");
    System.out.print("Are you ready? (Y/N)");
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println();
      String ans = scanner.nextLine().toUpperCase();
      if (ans.equals("Y")) {
        System.out.println("Great! Let's start.");
        guess(scanner, 0, 100);
      } else {
        System.out.println("Okay, bye!");
      }
    }
  }

  private static void guess(Scanner scanner, int lowest, int highest) {
    // Get a random number between [lowest, highest)
    Random random = new Random();
    int guess = lowest + random.nextInt(highest - lowest);
    System.out.println("My current guess is: " + guess + ". Is it hit your number? (0) or too big? (1) or too small? (2)");
    int judge = scanner.nextInt();

    switch (judge) {
      case 0:
        System.out.println("I got it! Your number is: " + guess);
        break;
      case 1:
        guess(scanner, lowest, guess);
        break;
      case 2:
        guess(scanner, guess, highest);
        break;
      default:
        System.out.println("Invalid input!");
        break;
    }
  }
}
