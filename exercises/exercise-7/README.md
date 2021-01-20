# Exercise 7
This exercise will be pretty similar to the last ones, I will therefore not be providing any hints, hopefully all of this is familiar enough, if not you can always go back to your previous exercises.

In this exercise, you'll manage shapes through a menu, the menu will show as follows:
```
1) Add a shape
2) Remove a shape
3) Print shape data
Please pick one: 
```

## Requirements
You should have the following files:
```
Main.java
ShapeController.java
Shape.java
Circle.java
Rectangle.java
Triangle.java
Square.java
```

I will give you two files, here is what should be in your `Shape.java`:
```Java
public abstract class Shape
{
    public abstract double getArea();
    public abstract String getShapeName();
}
```

This is what should be in your `Main.java`:
```Java
class Main
{
    public static void main(String[] args)
    {
        ShapeController shapeController = new ShapeController();
		shapeController.run();
    }
}
```

Additionally, the files: `Circle.java, Rectangle.java, Triangle.java and Square.java` should all have classes that inherit from your `Shape` class.

Here are the members you should have in the ShapeController:
Member Functions and Variables    | Description
--------------------------------- | -----------------------------------------------------
Scanner _scanner	              | stores the scanner for the input of our functions
Shape[] _shapesArr                | the array to store all our shape objects
boolean _isEmpty                  | this tracks if the array _shapesArr has anything in it, because the first time you `add` you need to make a new array
ShapeController()                 | ShapeController constructor
void run()                        | the primary function called by the `Main` class, it will handle the calling of all our other functions
void printMenu()                  | prints the menu you see above
void addShape()                   | will ask the user for a type of shape to add, then the parameters for that shape (ex: base and height for a triangle), after it will add that to the _shapesArr array
void removeShape()                | will remove a shape from the array, the user will see shapes starting at 1, so be sure to subtract one to make it line up with the array which starts at 0
void printShapes()                | for each shape, you print the type of shape, and its area

## Comparing strings
By now hopefully comparing two variables is engrained in your head, you do `var1 == var2`. Unfortunately, `Strings` don't work that way. I have no idea who at `Oracle` (the company that owns and makes Java) decided that `==` wasn't good enough. Even though they write a `+` operator for the String class, for some reason they decided `==` was too much more work. So unfortunately, the way you have to do it, is the following:
```Java
String str1 = "test";
String str2 = "Test";

if(str1.equals(str2))
{
    // This won't run because str2 has a capital T
}
else if(str1.equalsIgnoreCase(str2))
{
    // This will run because it ignores upper vs lower case
}
```

## Examples
Here is an example of me running the program, yours should run very similarly:
```
1) Add a shape
2) Remove a shape
3) Print shape data
4) Exit
Please pick one: 1

What shape do you want to add: Rectangle
Enter the length for of regtangle: 3.4
Enter the width for of regtangle: 6.7

1) Add a shape
2) Remove a shape
3) Print shape data
4) Exit
Please pick one: 1

What shape do you want to add: Triangle
Enter the base for of triangle: 13
Enter the height for of triangle: 6.5

1) Add a shape
2) Remove a shape
3) Print shape data
4) Exit
Please pick one: 3

Shape 1 is a Square and has an area of: 11.902500000000002
Shape 2 is a Circle and has an area of: 452.3893421169302
Shape 3 is a Rectangle and has an area of: 22.78
Shape 4 is a Triangle and has an area of: 42.25

1) Add a shape
2) Remove a shape
3) Print shape data
4) Exit
Please pick one: 2

What number shape do you want to remove: 2

1) Add a shape
2) Remove a shape
3) Print shape data
4) Exit
Please pick one: 3

Shape 1 is a Square and has an area of: 11.902500000000002
Shape 2 is a Rectangle and has an area of: 22.78
Shape 3 is a Triangle and has an area of: 42.25

1) Add a shape
2) Remove a shape
3) Print shape data
4) Exit
Please pick one: 4
```