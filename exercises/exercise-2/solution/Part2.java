import java.util.Scanner;

class Part2 // The class name has to be the same as the file name
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a numerator: ");
    int numerator = scanner.nextInt();

    System.out.println("Please enter a demoninator: ");
    int denominator = scanner.nextInt();

    int divisionResult = numerator / denominator;
    int remainder = numerator % denominator;

    // An alternate way to write this is if(numerator % denominator == 0)
    // I just wanted to calculate these before hand
    if(remainder == 0) // If the remainder is 0, then it divids evenly
    {
      System.out.println(numerator + " divided by " + denominator + " = " + divisionResult);
    }
    else
    {
      // You might be wondering what print does instead of println, well println makes a new line after the print
      // and I didn't want to make this line super long, so I split it up into two
      System.out.print(numerator + "/" + denominator + " simplifies to: " + divisionResult);
      System.out.println(" and " + remainder + "/" + denominator);
    }

    scanner.close();
  }
}