package gr.uaeb.cf.ch16ask2;

public abstract class AbstractShape implements IShape {
    private long id ;

    public void setID(long id){
        this.id = id ;
    }

    public long getId(){
        return id;
    }
}
