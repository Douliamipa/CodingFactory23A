package gr.uaeb.cf.ch16.shapes;

import java.io.Serializable;

public class Circle extends AbstractShape implements ICircle, ITwoDimensional, Serializable, Cloneable {
    private final static long serialVersionUID = 1 ;
    private double radius;

    public Circle(Circle circle){
        this.radius = circle.radius ;
    }

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException{
        return (Circle) super.clone();
    }
    @Override
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
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
