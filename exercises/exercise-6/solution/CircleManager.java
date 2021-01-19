import java.util.Scanner;

public class CircleManager
{
    private static int _numberOfCircles;
    private static Circle[] _circlesArr;

    public static void run()
    {
        obtainCircleInfo();
        printCircleInfo();
    }

    private static void obtainCircleInfo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many circles are you analyzing? ");
        _numberOfCircles = scanner.nextInt();

        System.out.println("");

        _circlesArr = new Circle[_numberOfCircles];

        for(int i = 0; i < _numberOfCircles; i++)
        {
            System.out.println("Please enter information for circle " + (i + 1) + ":");
            System.out.print("What is this circle's radius? ");
            double radius = scanner.nextDouble();

            System.out.print("What is the x position of the center of the circle? ");
            double xPos = scanner.nextDouble(); 

            System.out.print("What is the y position of the center of the circle? ");
            double yPos = scanner.nextDouble(); 

            _circlesArr[i] = new Circle(radius, xPos, yPos);
            System.out.println("");
        }
    }

    private static void printCircleInfo()
    {
        for(int i = 0; i < _numberOfCircles; i++)
        {
            System.out.println("Analysis of circle " + (i + 1) + ":");
            System.out.println("Radius: " + _circlesArr[i].getRadius());
            System.out.println("Diameter: " + _circlesArr[i].getDiameter());
            System.out.println("Area: " + _circlesArr[i].getArea());
            System.out.println("Circumference: " + _circlesArr[i].getCircumference());
            System.out.println("Distance from origin: " + _circlesArr[i].getDistanceToOrigin());

            int intersectCount = 0;

            for(int j = 0; j < _numberOfCircles; j++)
            {
                if(_circlesArr[i].isIntersecting(_circlesArr[j]) && i != j)
                {
                    if(intersectCount == 0)
                    {
                        System.out.print("This circle intersects with: ");
                    }

                    System.out.print("circle " + (j + 1) + " ");
                    
                    intersectCount++;
                }
            }

            System.out.println("");
            System.out.println("");
        }
    }
}