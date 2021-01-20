public class Triangle extends Shape
{
	private double _base, _height;

	public Triangle(double base, double height)
	{
		_base = base;
		_height = height;
	}

	@Override
	public double getArea()
	{
		return 0.5 * _base * _height;
	}

	@Override
	public String getShapeName()
	{
		return "Triangle";
	}
}