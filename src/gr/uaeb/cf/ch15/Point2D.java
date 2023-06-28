package gr.uaeb.cf.ch15;

public class Point2D  extends  Point{
    private int y ;

    public Point2D(){
        super();
        y = 0 ;
    }

    public Point2D(int x , int y) {
        super(x);
        //setX(x);
        this.y = y;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    @Override
//    public String convertToString() {
//        return super.convertToString() + "(" + y + ")";
//    }


    @Override
    public String toString() {
        return "Point2D{" +
                "y=" + y +
                '}';
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1 ;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected double getrDistanceFromOrigin() {
       return Math.sqrt(Math.pow(super.getrDistanceFromOrigin(),2) + Math.pow(getY(),2));
    }
}
