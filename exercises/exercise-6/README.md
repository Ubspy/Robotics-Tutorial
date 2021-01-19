# Exercise 6
In this exercise, we will be expanding on our `Circle class`. The goal will be to get information on our `Circle` objeccts. The user will tell us how many `Circle` objects they want to give, and then they'll enter the radii for each circle, then after we will print out a ton of information about the circles.

You will have two main classes: the `Circle` class, and the `CircleManager` class. The `Circle` class will hold objects of `Circles` like we had before, and `CircleManager` will hold the array of circles and print out all the information.

# Requirements
Here are the methods you should have for each class:
Circle Class Member Functions and Variables    | Description
---------------------------------------------- | -----------------------------------------------------
double _radius	                               | stores the radius of our circle object
double _xPos                                   | stores the center x position of a circle object
double _yPos                                   | stores the center y position of a circle object
double getRadius()                             | gets the radius of a circle object
double getDiameter()                           | gets the diameter of a circle object
double getArea()                               | gets the area of a circle object
double getCircumference()                      | gets the circumference of a circle object
double getDistanceToOrigin()                   | gets the distance of the center of the circle to the origin
double getDistanceToCircle(Circle secondCircle)| gets the distance from our circle object to another circle object
boolean isIntersecting(Circle secondCircle)    | checks if two circles are intersecting

CircleManager Member Functions and Variables   | Description
---------------------------------------------- | -----------------------------------------------------
int _numberOfCircles                           | stores the total number of circles in the array
Circle[] _circlesArr                           | stores all of our Circle objects
void obtainCircleInfo()                        | asks the user for all the circle information
void printCircleInfo()                         | prints out all important information about our circle objects
void run()                                     | the function called from our main function, will call all the other functions in our class

You cannot have anymore methods or variables than this, except for constructors. You can write your own constructors for the classes as needed.
Please keep the scope of all your stuff consistent, only make public what you absolutely need to.
If you need to look up any formulas for area or circumerence go right ahead.
Also, don't worry if you don't understand intersecting, I will explain that

## Math class
For this, you'll need to use `pi` and possibly the `sqrt` funciton. For that you need to use the `Math class`. It's a static class, so here's how you get both:
```Java
double squareRootOfTwo = Math.sqrt(2);
double piSquared = Math.PI * Math.PI;
```

## Circle scope
You might be wondering `how can I get the distance to another circle if I can't access it's member variables`. Well you can! Since `getDistanceToCircle` is a member of the `Circle` class, you can access all private member variables, that means you can do something like:
```Java
double getDistanceToCircle(Circle secondCircle)
{
    return secondCircle._radius;
}
```
Obviously that isn't how you do it, but it was to show you how you can use those private member variables. Again, this is *only* because the function `getDistanceToCircle` is a member function of `Circle`.

## Nested loops
To get the prints on the intersects working, you'll need to use a for loop inside of a for loop, you'll need to change the name of your iterating variable for the second loop. It's convention to use `j` for the second loop, `k` after that, and so on for the rest of the alphabet. Why? I have no idea. But please do not use `i` twice, it will cause problems in your code.

## Intersecting Circles
Now the math for this is a little funky, and I'm not going to expect you to know the formula, but I'll explain it for you. To know if two circles are intersecting, you need to compare it to their radii. If you get the difference of the radii of the two circles, that's the minimum amount of distance the circles can have between each other. If that distance is any smaller, the two circles will be inside one another, without actually intersecting. If you get the sum of their radii, that's the maximum amount they can be from each other, anymore and they're totally separated.

## Example
Here is an example of me running my program and putting in three circles:
```
Please enter information for circle 1:
What is this circle's radius? 100
What is the x position of the center of the circle? 50
What is the y position of the center of the circle? 0

Please enter information for circle 2:
What is this circle's radius? 100
What is the x position of the center of the circle? 0
What is the y position of the center of the circle? 50

Please enter information for circle 3:
What is this circle's radius? 20
What is the x position of the center of the circle? 65
What is the y position of the center of the circle? 0

Analysis of circle 1:
Radius: 100.0
Diameter: 200.0
Area: 31415.926535897932
Circumference: 628.3185307179587
Distance from origin: 50.0
This circle intersects with: circle 2 

Analysis of circle 2:
Radius: 100.0
Diameter: 200.0
Area: 31415.926535897932
Circumference: 628.3185307179587
Distance from origin: 50.0
This circle intersects with: circle 1 circle 3 

Analysis of circle 3:
Radius: 20.0
Diameter: 40.0
Area: 1256.6370614359173
Circumference: 125.66370614359172
Distance from origin: 65.0
This circle intersects with: circle 2 
```