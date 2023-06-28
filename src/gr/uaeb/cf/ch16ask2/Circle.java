package gr.uaeb.cf.ch16ask2;

public class Circle extends AbstractShape implements ICircle{

    private double radius ;

    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getDiameter() {
        return  2* this.radius ;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public long getCircumference() {
        return  (long)(2*Math.PI*radius);
    }


}
