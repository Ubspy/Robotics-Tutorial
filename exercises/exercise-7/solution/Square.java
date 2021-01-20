public class Square extends Shape
{
	private double _length;

	public Square(double length)
	{
		_length = length;
	}

	@Override
	public double getArea()
	{
		return _length * _length;
	}

	@Override
	public String getShapeName()
	{
		return "Square";
	}
}