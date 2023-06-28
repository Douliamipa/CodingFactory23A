package gr.uaeb.cf.ch15;

public class Point3D extends  Point2D{
    private int z ;
    public  Point3D(){
//        super();
//        z = 0 ;
    }

    public Point3D(int x , int y , int z ){
        super(x ,y );
        this.z = z ;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

//    @Override
//    public String convertToString() {
//        return super.convertToString() + "(" + z + ")";
//    }


    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1 ;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10 ;
    }

    @Override
    protected double getrDistanceFromOrigin() {
        return Math.sqrt(Math.pow(super.getrDistanceFromOrigin(),2)  +Math.pow(getZ(),2));
    }
}
