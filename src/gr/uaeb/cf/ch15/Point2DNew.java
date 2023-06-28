package gr.uaeb.cf.ch15;

/**
 *
 * COmposition and forwarding
 * Wrapper and decoration
 * Delegation Pattern
 */
public class Point2DNew {
    //Composition - private instance
    private  Point point ;
    private  int y ;

    public Point2DNew(){};
    public Point2DNew(Point point, int y) {
        this.point = point;
        this.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    //Forwarding
    public void movePlus10(){
        point.movePlus10();
        y += 10;
    }

    public void movePlusOne(){
        point.movePlusOne();
        y += 1;
    }
}
