package gr.uaeb.cf.ch16ask1;

public class Rectangle extends AbstrachSHape implements ITwoDImensional{
    private double width ;
    private  double height ;

    public Rectangle(){
        super();
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height ;
    }
}
