package gr.uaeb.cf.ch17.builder;

public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder(1,"123456").build();
        Book book2 = new Book.Builder(2,"234567").author("Ath . A.").title("Java").build();
    }
}
