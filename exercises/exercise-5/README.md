# Exercise 5
This exercise will be a bit different, here you'll program an actual interface. The goal of this program will be to write a number analysis program.

Your main function should contain as little as possible, it shouldn't be longer than 2 lines.
When you first run the program, you should ask for how many numbers you'd like to input for a data set, then you should allow the user to input those numbers (remember, we did this before (: ), here's an example of what it should look like:
```
How many numbers do you have? 5
Enter number 1: 24
Enter number 2: 15
Enter number 3: 6
Enter number 4: 24
Enter number 5: 120
```

Then you will have a menu, this menu will show up quite a bit, it should look like this:
```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
```

If they give a number outside the range, it will look like this:
```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: -1

That's not a valid choice, please try again

1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 
```

You should be able to keep inputting numbers until they choose to exit.

## Scanners
We will be opening scanner objects inside of functions here, because you'll be getting input inside of the functions. It will work just like it would in main, except **you do not want to close the scanners until you're done using all of them**. Once you close one scanner, none of them will work.

## Rules
The first rule is, your main file should only have a single line in it, and that should be the `run()` function:
```Java
public static main(String args[])
{
    run();
}
```

Inside the `run()` function, we can actually run the program, but I also don't want you to write everything in the `run()` function.
You are required to have the following functions:
Function w/ Return Type and Parameters         | Description
---------------------------------------------- | -----------------------------------------------------
static void run() 		                       | handles calling all the other functions
static double[] getInitialData()               | gets the initial data from the user and returns it as an array
static void printMenu()                        | print out the menu you will see above, it does not need to handle any input
static void getStatistics(double[] data)       | take an array of data, print statistics about the data (more info below)
static double getAverate(double[] data)        | take an array of data, get its average
static double getMin(double[] data)            | take an array of data, get its min value
static double getMax(double[] data)            | take an array of data, get its max value 
static void printData(double[] data)           | take an array of data, and print it out
static double[] addNumber(double[] data)       | take an array of data, add a number, and return the new array
static double[] removeNumber(double[] data)    | take an array of data, remove a number, then return the new array
static void checkForNumber(double[] data)      | handle input for checking for a particular number, if the number is found more than once, say how many times that number showed up
static int numberCount(double[] data, int num) | take an array and give how many times a number shows up

## Functions that return arrays
Remember how in Java, everything `passes by value`, which means that if you pass in your array from the `run()`, it won't change that array, it will only change the array inside that function, so I'll show you an example here where we double every value and return the array, and get it back in `run()`. Here we'll be assuming that data[] is already defined.
```Java
void run()
{
    data = doubleData(data);
}

double[] doubleData(double[] data)
{
    for(int i = 0; i < data.length(); i++)
    {
        data[i] *= 2;
    }

    return data;
}
```
Here we double every value in the array inside the `doubleData()` function, and then return it back so we can save it on the original array in `run()`.

You only need to check for bad input on the menu, in any other function, you can assume the number given will be positive and of the right type.

## Examples
Here I will show example for each part of the program. All of this will use the data shown above

### Data statistics
```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 1

Your data set has these statistics:
Mean/Average: 38.0
Min value: 6.0
Max value: 120.0
Most value: 24.0
```

Just incase you don't get what `Most value` means, it's the value that appears the largest number of times in a data set.

### Print data set
```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 2

Here is your current data set: 24.0, 15.0, 6.0, 24.0, 120.0
```

### Add a number
```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 3

What number do you want to add: 50
```

If you print your dataset after this, it should look like this:
```
Here is your current data set: 24, 15, 6, 24, 120, 50
```

### Remove a number
```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 4

What number do you want to remove: 24
```

If you print your dataset after this, it should look like this:
```
Here is your current data set: 15, 6, 120
```

### Check for a number
```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 5

What number do you want to check for: 24
The number 24 appears 2 times
```

```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 5

What number do you want to check for: 6
The number 6 appears 1 time
```

```
1) Data set statistics
2) Print data set
3) Add a number
4) Remove a number
5) Check for a number
6) Exit
Please pick one: 5

What number do you want to check for: 80
The number 80 does not appear
```