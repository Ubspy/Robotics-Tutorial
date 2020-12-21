import java.util.Scanner;

class Part1 // The class name has to be the same as the file name
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a pokemon ID: ");
    int id = scanner.nextInt();

    if(id < 1 || id > 898)
    {
      System.out.println("That isn't a valid pokemon ID");
    }
    else if(id <= 151)
    {
      System.out.println("Your pokemon is in gen 1");
    }
    else if(id <= 251)
    {
      System.out.println("Your pokemon is in gen 2");
    }
    else if(id <= 386)
    {
      System.out.println("Your pokemon is in gen 3");
    }
    else if(id <= 493)
    {
      System.out.println("Your pokemon is in gen 4");
    }
    else if(id <= 649)
    {
      System.out.println("Your pokemon is in gen 5");
    }
    else if(id <= 721)
    {
      System.out.println("Your pokemon is in gen 6");
    }
    else if(id <= 809)
    {
      System.out.println("Your pokemon is in gen 7");
    }
    else
    {
      System.out.println("Your pokemon is in gen 8");
    }

    scanner.close();
  }
}