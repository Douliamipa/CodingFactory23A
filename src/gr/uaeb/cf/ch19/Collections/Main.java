package gr.uaeb.cf.ch19.Collections;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "Pris", "London"); //den epirepsei add i remove
        Iterator<String> it = cities.iterator();

        for (int i  = 0 ; i < cities.size() ; i++){
            System.out.println(cities.get(i));
        }

        for (String s : cities){
            System.out.println(s);
        }

        while (it.hasNext()){
            String s =it.next();
            System.out.println(s);
        }

        cities.forEach(System.out::println);

        cities.removeIf(s -> s.equals("Paris"));

    }
}
