import java.util.Scanner;

class Main // The class name has to be the same as the file name
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("What number of the fibbonaci sequence do you want to see up to?");
		int fibNum = scanner.nextInt();

		while(fibNum <= 0)
		{
			System.out.println("That's not a valid number, please enter a positive integer above 0:");
			fibNum = scanner.nextInt();
		}

		if(fibNum == 1)
		{
			System.out.print("0");
		}
		else if(fibNum == 2)
		{
			System.out.print("0, 1");
		}
		else
		{
			System.out.print("0, 1, ");

			int firstPreviousNum = 0;
			int secondPreviousNum = 1;
			int currentNum = 1;

			for(int i = 2; i < fibNum; i++)
			{
				currentNum = firstPreviousNum + secondPreviousNum;
				firstPreviousNum = secondPreviousNum;
				secondPreviousNum = currentNum;

				System.out.print(currentNum);

				if(i != (fibNum - 1))
				{
					System.out.print(", ");
				}
			}
		}

	scanner.close();
	}
}