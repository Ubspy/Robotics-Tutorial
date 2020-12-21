# Exercise 2
The goal of this exercise will be to practice your understanding of if/else if/else blocks. Seeing how these are a little short, I've made two different problems. Problem 1 should be pretty easy, problem 2 might make you think a little more.

## Part 1
Here we are going to write a program that classifies pokemon. You're going to get a pokemon id from the user, and tell it which generation of pokemon it is. For those of you not aware, each time a new pokemon game came out it was classified as a `new generation`. So the first set of games was generation 1, second set was generation 2, so on and so forth. Your goal will be to tell the user which generation (and if you want which games they first showed up in) after they give you the id.

To make it easier on you, here's a table showing which IDs coorolate to which generation (if you want, you can abbreviate `generation` to `gen`, I will be).
ID Range	| Generation
----------- | ----------
1-151		| Gen 1
152-251		| Gen 2
252-386		| Gen 3
387-493		| Gen 4
494-649		| Gen 5
650-721		| Gen 6
722-809		| Gen 7
810-898		| Gen 8


### Rules
* Not only should you say if it's in gen 1 through 8, you should also check if it's out of range (not anywhere from 1 to 898)
* You can only have **one** if/else if/else block, meaning you can only have a single if statement. For clarification, you can have as many else if statements as you want, but you can only have one if statement (and consequently, one else statement)
* Use appropriate variable types (i.e. if I was asking you to give the first letter of your name, you wouldn't use a `string`)
* Try to use as little AND (`&&`) and OR (`||`) operators as possible

## Examples
```
Enter a pokemon ID: 
200
That pokemon is in gen 2
```

```
Enter a pokemon ID: 
397
That pokemon is in gen 4
```

```
Enter a pokemon ID: 
-4
That isn't a valid pokemon ID
```

```
Enter a pokemon ID: 
900
That isn't a valid pokemon ID
```

## Part 2
I want you to write a program to turn an `improper fraction` into a `mixed number`. Remember that an improper fraction is when the numerator is larger than the denominator (ex: 34/5). A mixed number is when you have a whole number, and a fraction (ex: 3 and 1/2, which is the same as 7/2). Hopefully you remember this from your math classes. If not, you can see the section below.

For clarification on input, I would get a numerator, and a denominator from the user, and then do the conversion. Get two separate numbers, don't have the user input like `5/3`, have them input `5`, then `3`.

### Math review
If you're wondering how I turned `3 and 1/2` into `7/2` it's easier than it might seem. You need to remember that `3 and 1/2` is the same as `3 + 1/2`. So if you turn `3` into a fraction, it's the same as `3/1` (since 3 / 1 is 3). Now to add them, they need a common denominator, so you multiply both the top and the bottom of `3/1` by 2, which turns it into `6/2`. The addition is now `6/2 + 1/2` and all you need to do is add the numerators to get `7/2`.

### Rules
* Like the last one, you can only have on if/else if/else block
* You *cannot* use either the AND (`&&`) or the OR (`||`) operator
* You can assume there won't be any negative numbers
* You do not need to simplify any fractions, if you have `2/4` for example you **do not** need to simplify it to `1/2`

## Examples
```
Enter a numerator:
39
Enter a denominator:
7
39/7 simplifies to: 5 and 4/7
```

```
Enter a numerator:
49
Enter a denominator:
7
49 divided by 7 = 7
```

```
Enter a numerator:
112
Enter a denominator:
6
112/6 simplifies to: 18 and 4/6
```