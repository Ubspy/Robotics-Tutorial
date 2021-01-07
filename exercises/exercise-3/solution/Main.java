import java.util.Scanner;

class Main // The class name has to be the same as the file name
{
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);

	System.out.print("Please enter a word: ");
	String word = scanner.next();

	// Default it to true, if it's false 
	boolean isPalindrome = true;

	// We're going to loop half way through the word because we don't need to check the full thing
	for(int i = 0; i < word.length() / 2; i++)
	{
		// Compare the i-th character to the (length - i)-th character
		if(word.charAt(i) != word.charAt(word.length() - 1 - i))
		{
			isPalindrome = false;
		}
	}

		// Print different stuff depending on whether or not it's a palindrome
	if(isPalindrome)
	{
		System.out.println(word + " is a palindrome");
	}
	else
	{
		System.out.println(word + " is not a palindrome");
	}

	scanner.close();
	}
}