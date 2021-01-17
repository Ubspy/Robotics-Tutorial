import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the base of your triangle:");
    double base = scanner.nextDouble(); // You can also use a float here

    System.out.println("Please enter the height of your triangle:");
    double height = scanner.nextDouble();

    System.out.println((base + height) / 2);
    scanner.close();
  }
}