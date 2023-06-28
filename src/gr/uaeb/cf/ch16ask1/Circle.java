package gr.uaeb.cf.ch16ask1;

public class Circle extends AbstrachSHape implements ITwoDImensional{
    private double radius ;

    public Circle(){
        super();
    }

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
    public double getArea() {
        return  Math.PI * Math.pow(radius,2);
    }
}
