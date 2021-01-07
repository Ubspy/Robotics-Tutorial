<details>
	<summary>I'm stuck</summary>

	Understandably so, I'd start with thinking about the problem at large, you need to check all the characters, or at least half of them. That sounds like a loop doesn't it?
</details>

<details>
	<summary>I don't know how to track if it's a palindrome</summary>

	So this is the type of problem, if one of our checks is false, then the overall thing should be false. The way I would do it, is store is it's a palindrome in a boolean variable, then if one of them returns false, you override the variable. Make it so once it's false, it can't be true again.
</details>

<details>
	<summary>I'm struggling with my loop</summary>

	The length of your loop shouldn't be the whole length of your string. Think about it like this, let's take the example `pop`, you need to check the first character and see if it's the same as the last, and you can ignore the middle char. That means you only need to loop through half of the string (3 / 2 is 1.5, or for an int it's just 1). If you're evaluating `peep`, you need to check twice, which is still half of the word length. You check if the first and last char are the same. then the second and third char.
</details>