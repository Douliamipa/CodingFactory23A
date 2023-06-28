package gr.uaeb.cf.ch16.shapes;

import java.util.Objects;

public class Line extends AbstractShape implements IShape{
    private Point p1 ;
    private Point p2 ;
    public  Line(){}

    public Line(Line line){
        this.p1 = line.p1 ;
        this.p2 = line.p2 ;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    @Override
    protected Line clone() throws CloneNotSupportedException{
        return (Line) super.clone();
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!Objects.equals(p1, line.p1)) return false;
        return Objects.equals(p2, line.p2);
    }

    @Override
    public int hashCode() {
        int result = p1 != null ? p1.hashCode() : 0;
        result = 31 * result + (p2 != null ? p2.hashCode() : 0);
        return result;
    }
}
