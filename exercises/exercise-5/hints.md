<details>
	<summary>I don't know where to start</summary>

The way I tackle these big projects, is I do them one at a time. Get your `run()` function to get input and print the menu until you type in `6`. Then do the function that sounds easiest, then so on.
</details>

<details>
	<summary>I don't know to make it keep getting input until they exit</summary>

Let's break this down, it's a thing that needs to repeat yes? What is that? It's a loop. Now we have two kinds of loops, one that will loop a predetermined amount of times, and one that will loop until a certain criteria is met. Which one does this sound like?

If you already understood what type of loop we need to use, how to we get it to do what we want? Well think about it for a second, when they type `6`, we want them to exit. Maybe you should shore a variable and check for that.
</details>

<details>
    <summary>I don't know how to get the initial data</summary>

There is a good example of this already in the guide, look in the `Arrays` section.
</details>

<details>
    <summary>I don't understand the getStatistics() function</summary>

getStatistics() is going to be pretty basic, in fact I'll show you line from mine:
```Java
System.out.println("Mean/Average: " + getAverage(data));
```
None of your lines should be more complicated than that.
</details>

<details>
    <summary>I don't know how to get the average</summary>

There is a good example of this already in the guide, look in the `Arrays` section.
</details>

<details>
    <summary>I don't know how to get the min/max</summary>

Remember you did this in the `Arrays` exercise, `exercise-4`, it's very similar.
</details>

<details>
    <summary>I don't know how to get the most</summary>

Once you get the max down, it's very similar, my hint is to use the `numberCount` function.
</details>

<details>
    <summary>I don't know how to get the most</summary>

Once you get the max down, it's very similar, my hint is to use the `numberCount` function.
</details>

<details>
    <summary>I don't know how to add a number to an array</summary>

Once an array of size `x` is created, you cannot change its size. To change the size, you **need** to make a new array of size `y`. It's pretty simple from there, just copy everything over and pop the new element in the last index.

If you're still lose, try a for loop.
</details>

<details>
    <summary>I don't know how to remove a number from an array</summary>

This is honestly the trickiest part. What helps me is draw the actual arrays out on paper before and after removal and look at their indeces, see if that helps.

If that doesn't help, keep in mind your new array will need to keep track of how many elements have been removed so the indeces can line up.
</details>