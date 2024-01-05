import java.util.Scanner;
import java.util.Random;

public class Guessing {
  public static void main(String[] args) {
    System.out.println("Choose game level first: ");
    System.out.println("Easy: number is between [0, 100). (1) ");
    System.out.println("Medium: number is between [0, 1000). (2) ");
    System.out.println("Hard: number is between [0, 10000). (3) ");
    System.out.print("Choose your level: ");
    
    try (Scanner scanner = new Scanner(System.in)) {
      int level = scanner.nextInt();
      Random random = new Random();
      int number;

      switch (level) {
        case 1:
          number = random.nextInt(100);
          break;
        case 2:
          number = random.nextInt(1000);
          break;
        case 3:
          number = random.nextInt(10000);
          break;
        default:
          System.out.println("Invalid level, please try again!");
          return;
      }

      System.out.print("Give your guess: ");
      int guess = scanner.nextInt();
      while (guess != number) {
        if (guess > number) {
          System.out.print("It's too big, try again! ");
        } else {
          System.out.print("It's too small, try again! ");
        }
        guess = scanner.nextInt();
      }
      System.out.println("Great! You get it. My number is: " + number);
    }
  }
}
