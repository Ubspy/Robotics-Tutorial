import java.util.Scanner;

class Main // The class name has to be the same as the file name
{
    static void run()
    {
        // Make a scanner
        Scanner scanner = new Scanner(System.in);

        // Then we get the initial data using that scanner
        double[] data = getInitialData();

        // Now we want to run a while loop until they want to exit, so let's make a
        // user choice var and use that
        int userChoice = 0;

        while(userChoice != 6)
        {
            // Print menu and get input
            printMenu();
            userChoice = scanner.nextInt();
            System.out.println("");

            // Now we have an else if block to see which one
            if(userChoice == 1)
            {
                getStatistics(data);
            }
            else if(userChoice == 2)
            {
                printData(data);
            }
            else if(userChoice == 3)
            {
                data = addNumber(data);
            }
            else if(userChoice == 4)
            {
                data = removeNumber(data);
            }
            else if(userChoice == 5)
            {
                checkForNumber(data);
            }
            else if(userChoice != 6)
            {
                System.out.println("That's not a valid choice, please try again");
            }
        }

        // Now that we're done, close the scanner
        scanner.close();
    }

    static double[] getInitialData()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you have: ");
        int dataCount = scanner.nextInt();

        double[] data = new double[dataCount];

        for(int i = 0; i < dataCount; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            data[i] = scanner.nextDouble();
        }

        return data;
    }

    static void printMenu()
    {
        System.out.println("");
        System.out.println("1) Data set statistics");
        System.out.println("2) Print data set");
        System.out.println("3) Add a number");
        System.out.println("4) Remove a number");
        System.out.println("5) Check for a number");
        System.out.println("6) Exit");
        System.out.print("Please pick one: ");
    }

    static void getStatistics(double[] data)
    {

    }

    static double getAverage(double[] data)
    {
        int totalCount = 0;

        for(int i = 0; i < data.length; i++)
        {
            totalCount += data[i];
        }

        double average = totalCount / data.length;
        return average;
    }

    static double getMin(double[] data)
    {
        double minNum = data[0];

        for(int i = 0; i < data.length; i++)
        {
            // Check if the current number is smaller than previously stored one
            if(data[i] < minNum)
            {
                minNum = data[i];
            }
        }

        return minNum;
    }

    static double getMax(double[] data)
    {
        double maxNum = data[0];

        for(int i = 0; i < data.length; i++)
        {
            // Check if the current number is bigger than previously stored one
            if(data[i] > maxNum)
            {
                maxNum = data[i];
            }
        }

        return maxNum;
    }

    static void printData(double[] data)
    {
        System.out.print("Here is your data: ");
        for(int i = 0; i < data.length; i++)
        {
            if(i < data.length - 1)
            {
                System.out.print(data[i] + ", ");
            }
            else
            {
                System.out.println(data[i]);
            }
        }
    }

    static double[] addNumber(double[] data)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to add: ");
        double newEntry = scanner.nextDouble();

        // Make new array size one larger than previous one
        double[] newData = new double[data.length + 1];

        for(int i = 0; i < newData.length; i++)
        {
            // Check if it's the last entry, if it is then set it to the new entry
            if(i < newData.length - 1)
            {
                newData[i] = data[i];
            }
            else
            {
                newData[i] = newEntry;
            }
        }

        return newData;
    }

    static double[] removeNumber(double[] data)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to remove: ");
        double toRemove = scanner.nextDouble();

        int sizeDifference = numberCount(data, toRemove);

        // Make new array size one larger than previous one
        double[] newData = new double[data.length - sizeDifference];
        int offset = 0;

        for(int i = 0; i < data.length; i++)
        {
            if(data[i] != toRemove)
            {
                System.out.print(data[i] + ", ");
                newData[i - offset] = data[i];
            }
            else
            {
                offset++;
            }
        }

        return newData;
    }

    static void checkForNumber(double[] data)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number do you want to check for: ");
        double toCheck = scanner.nextDouble();
        int numCount = numberCount(data, toCheck);

        if(numCount > 1)
        {
            System.out.println("The number " + toCheck + " showed up " + numCount + " times");
        }
        else if(numCount > 0)
        {
            System.out.println("The number " + toCheck + " showed up once");
        }
        else
        {
            System.out.println("The number " + toCheck + " did not show up");
        }
    }

    static int numberCount(double[] data, double num)
    {
        int count = 0;

        for(int i = 0; i < data.length; i++)
        {
            if(data[i] == num)
            {
                count++;
            }
        }

        return count;
    }

	public static void main(String[] args)
	{
        run();
	}
}