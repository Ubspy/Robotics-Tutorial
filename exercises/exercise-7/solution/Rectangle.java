public class Rectangle extends Shape
{
	private double _length, _width;

	public Rectangle(double length, double width)
	{
		_length = length;
		_width = width;
	}

	@Override
	public double getArea()
	{
		return _length * _width;
	}

	@Override
	public String getShapeName()
	{
		return "Rectangle";
	}
}