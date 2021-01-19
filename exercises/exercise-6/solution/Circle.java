public class Circle
{
    private double _radius, _xPos, _yPos;

    public Circle(double radius, double xPos, double yPos)
    {
        _radius = radius;
        _xPos = xPos;
        _yPos = yPos;
    }

    public double getRadius()
    {
        return _radius;
    }

    public double getDiameter()
    {
        return _radius * 2;
    }

    public double getArea()
    {
        return _radius * _radius * Math.PI;
    }

    public double getCircumference()
    {
        return _radius * 2 * Math.PI;
    }

    public double getDistanceToOrigin()
    {
        return Math.sqrt((_xPos * _xPos) + (_yPos * _yPos));
    }

    public boolean isIntersecting(Circle secondCircle)
    {
        return Math.abs(secondCircle._radius - _radius) <= getDistanceToCircle(secondCircle) && (secondCircle._radius + _radius) >= getDistanceToCircle(secondCircle);
    }

    private double getDistanceToCircle(Circle secondCircle)
    {
        double xDiff = secondCircle._xPos - _xPos;
        double yDiff = secondCircle._yPos - _yPos;

        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
}