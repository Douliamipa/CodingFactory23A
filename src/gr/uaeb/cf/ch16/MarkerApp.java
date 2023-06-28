package gr.uaeb.cf.ch16;

public class MarkerApp {

    public static void main(String[] args) {
        Item book = new Book(1,"123456","Muller A .","TCP/IP Networks");
        Item cs = new CompactDisk(1,"Prince");

        deliver(book);
    }

    public static void deliver(Item item){
        if (item instanceof Book){
            System.out.println("Book delivered");
        }else if (item instanceof CompactDisk){
            System.out.println("CD delivered");
        }else {
            throw  new AssertionError(item);
        }
    }
}
