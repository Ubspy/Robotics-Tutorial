# Optional exercise: loops
I want you to write a program that will show n numbers of the fibbonaci sequence, where n is a number given by the user. Here is what the fibbonaci sequence looks like:
* F1 (the first number of the sequence) = 0
* F2 (second number of the sequence) = 1
* Fn (the n-th number of the sequence) = F(n-2) + F(n-1)
So the n-th number is the sequence is the sum of the previous two elements in the sequence, but the first two numbers are defined.

<details>
	<summary>Since this is a little complicated, I'll put some hints here:</summary>

	* Use a while loop to check for negative numbers on input
    * Use a for loop to print out the sequence like in the `examples` section, I would print the numbers as you go along the for loop
    * To see if you need to print a comma or not, check if it's the last element of the loop (which would be n - 1)
    * You only need to calculate the numbers when the number is greater than two, so have an if statement checking to see if they just want the 1st or 2nd element
    * Have three variables for the for loop, the current number, the n-1 number, and the n-2 number
</details>

This exercise is a little different to have hints in their own thing, so I'm just going to keep all the hints here

## Rules
* Use appropriate variable types (i.e. if I was asking you to give the first letter of your name, you wouldn't use a `string`)
* You have to check to make sure the number given is valid (non-zero and positive)

## Examples
Your output doesn't need to look exactly like mine, but it should be somewhat similar:
```
What number of the fibbonaci sequence do you want to see up to?
-5
That's not a valid number, please enter a positive integer:
-12
That's not a valid number, please enter a positive integer:
12
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
```

```
What number of the fibbonaci sequence do you want to see up to?
1
0
```

```What number of the fibbonaci sequence do you want to see up to?
2
0, 1
```