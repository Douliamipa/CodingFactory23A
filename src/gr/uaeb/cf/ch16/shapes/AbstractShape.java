package gr.uaeb.cf.ch16.shapes;

public abstract class AbstractShape implements IShape {
    private long id ;
    @Override
    public long getId() {
        return 0;
    }

    public void setId(long id) {
        this.id = id;
    }
}
