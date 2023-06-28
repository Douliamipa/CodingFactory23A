package gr.uaeb.cf.ch16ask1;

public abstract class AbstrachSHape implements IShape {
    private long id ;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
