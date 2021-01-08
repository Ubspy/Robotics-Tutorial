import java.util.Scanner;

class Main // The class name has to be the same as the file name
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("How many words would you like to enter? ");
        int wordCount = scanner.nextInt();

        String[] words = new String[wordCount];

        for(int i = 0; i < wordCount; i++)
        {
            System.out.print("Please enter word # " + (i + 1) + ": ");
            words[i] = scanner.next();
        }
        
        // Set the shortest word possible to a 0 length
        String longestWord = "";
        for(int i = 0; i < wordCount; i++)
        {
            if(longestWord.length() < words[i].length())
            {
                longestWord = words[i];
            }
        }

        // Now that we know the longest, we'll set the initial shortest to that so it can be overridden
        String shortestWord = longestWord;
        for(int i = 0; i < wordCount; i++)
        {
            if(shortestWord.length() > words[i].length())
            {
                shortestWord = words[i];
            }
        }

        System.out.println("The longest word was: " + longestWord);
        System.out.println("The shortest word was: " + shortestWord);

		scanner.close();
	}
}