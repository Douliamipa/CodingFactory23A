package gr.uaeb.cf.ch19.Collections;

public class MyStackApp {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(2);
        myStack.push(1);
        myStack.push(3);
        myStack.push(4);
        int lastNum = myStack.pop();
        System.out.println("" + lastNum);

        myStack.forEach(System.out::println);
    }
}
