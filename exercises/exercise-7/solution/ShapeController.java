import java.util.Scanner;

public class ShapeController
{
    private Scanner _scanner;
    private Shape[] _shapesArr;
	private boolean _isEmpty;

	public ShapeController()
	{
		_scanner = new Scanner(System.in);
		_shapesArr = new Shape[1];
		_isEmpty = true;
	}

    public void run()
    {
        // Now we want to run a while loop until they want to exit, so let's make a
        // user choice var and use that
        int userChoice = 0;

        while(userChoice != 4)
        {
            // Print menu and get input
            printMenu();
            userChoice = _scanner.nextInt();
            System.out.println("");

            // Now we have an else if block to see which one
            if(userChoice == 1)
            {
                addShape();
            }
            else if(userChoice == 2)
            {
                removeShape();
            }
            else if(userChoice == 3)
            {
                printShapes();
            }
            else if(userChoice != 4) // If it wasn't any of those, and it isn't 4 (because 4 will quit), we tell them it's an invalid option
            {
                System.out.println("That's not a valid choice, please try again");
            }
        }

        // Now that we're done, close the scanner
        _scanner.close();
    }

    private void printMenu()
    {
        System.out.println("");
        System.out.println("1) Add a shape");
        System.out.println("2) Remove a shape");
        System.out.println("3) Print shape data");
		System.out.println("4) Exit");
        System.out.print("Please pick one: ");
    }

    private void addShape()
    {
        System.out.print("What shape do you want to add (circle, rectangle, square, triangle): ");
        String newShapeType = _scanner.next();
        Shape newShapeObject;

        if(newShapeType.equalsIgnoreCase("circle"))
        {
			System.out.print("Enter the radius of your circle: ");
			double radius = _scanner.nextDouble();

			newShapeObject = new Circle(radius);
        }
        else if(newShapeType.equalsIgnoreCase("rectangle"))
        {
			System.out.print("Enter the length for of regtangle: ");
			double length = _scanner.nextDouble();

			System.out.print("Enter the width for of regtangle: ");
			double width = _scanner.nextDouble();

			newShapeObject = new Rectangle(length, width);
        }
        else if(newShapeType.equalsIgnoreCase("square"))
        {
			System.out.print("Enter the length for of square: ");
			double length = _scanner.nextDouble();

			newShapeObject = new Square(length);
        }
        else if(newShapeType.equalsIgnoreCase("triangle"))
        {
			System.out.print("Enter the base for of triangle: ");
			double base = _scanner.nextDouble();

			System.out.print("Enter the height for of triangle: ");
			double height = _scanner.nextDouble();

			newShapeObject = new Triangle(base, height);
        }
        else
        {
            System.out.println("That isn't a valid shape :(");
			return;
        }

		Shape[] newShapesArr;

		if(_isEmpty)
		{
			// If the array doesn't have a value, make it size 1, and set it so now we know the array is defined
			newShapesArr = new Shape[1];
			_isEmpty = false;
		}
		else
		{
			// Make new array size one larger than previous one
        	newShapesArr = new Shape[_shapesArr.length + 1];
		}

        for(int i = 0; i < newShapesArr.length; i++)
        {
            // Check if it's the last entry, if it is then set it to the new entry
            if(i < newShapesArr.length - 1)
            {
                newShapesArr[i] = _shapesArr[i];
            }
            else
            {
                newShapesArr[i] = newShapeObject;
            }
        }

		// At the end we set the private member var to be the new array
		_shapesArr = newShapesArr;
    }

    private void removeShape()
    {
        System.out.print("What number shape do you want to remove: ");
        double indexToRemove = _scanner.nextDouble();

		if(_isEmpty)
		{
			System.out.println("Nothing to remove!");
		}
		else
		{
			// Make new array size one larger than previous one
			Shape[] newShapeArr = new Shape[_shapesArr.length - 1];

			// We need to store an offset, since the indexes of the new array will be different than those of the old one
			int offset = 0;

			for(int i = 0; i < _shapesArr.length; i++)
			{
				// If the number isn't something we're trying to move when copying, we copy the indexes over while taking account for the offset
				// They'll be giving us a number that doesn't start at 0, so we need to subtract by 1
				if(i != indexToRemove - 1)
				{
					newShapeArr[i - offset] = _shapesArr[i];
				}
				else // If it is a number we want to remove, we add one to the offset and don't copy anyhting
				{
					offset++;
				}
			}

			_shapesArr = newShapeArr;
		} 
    }

    private void printShapes()
    {
		if(_isEmpty)
		{
			System.out.println("There are no shapes in your array :(");
		}
		else
		{
			for(int i = 0; i < _shapesArr.length; i++)
			{
				System.out.println("Shape " + (i + 1) + " is a " + _shapesArr[i].getShapeName() + " and has an area of: " + _shapesArr[i].getArea());
			}
		}
    }
}