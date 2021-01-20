public class Circle extends Shape
{
    private double _radius;

    public Circle(double radius)
    {
        _radius = radius;
    }

    @Override
    public double getArea()
    {
        return _radius * _radius * Math.PI;
    }

    @Override
    public String getShapeName()
    {
        return "Circle";
    }
}