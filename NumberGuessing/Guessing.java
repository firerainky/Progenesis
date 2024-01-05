import java.util.Scanner;
import java.util.Random;

public class Guessing {
  public static void main(String[] args) {
    System.out.println("Hi, I got a number between [0, 100), can you guess it? I will give you some hints");

    Random random = new Random();
    int number = random.nextInt(100);

    System.out.print("Give your guess: ");
    try (Scanner scanner = new Scanner(System.in)) {
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
