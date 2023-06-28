package gr.uaeb.cf.ch19.maps;

import gr.uaeb.cf.ch19.sorting.Product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        Map<String ,String> countries = new HashMap<>();

        countries.put("Gr", "Greece");
        countries.put("FR","France");
        countries.put("USA","United States Of America");

        //mporoume kai me dipla curly brachets

        Map<Integer , Product> products = new HashMap<>(){{
            put(1,new Product("Apples",10.5,10));
            put(2,new Product("Oranges",8.5,8));
            put(3,new Product("Milk",1.5,13));
            put(4,new Product("Apples",5.5,5));

        }};

        Map<String , Object> criteria = new HashMap<>()
        {{
            put("description" , "Oranges");
            put("price" , "8.5");

        }};

        String choice = products.values().stream()
                .filter(product -> product.getDescription()
                        .equals(criteria.get("description")) && (Double.compare(product.getPrice(), (double) criteria.get("price"))) >= 0)
                .map(Product::toString)
                .collect(Collectors.joining(","));

        String strProducts = products.entrySet().stream()
                .filter(entry -> entry.getValue().getDescription().equals("Apples"))
                .map(Object::toString)
                .collect(Collectors.joining(","));

        Iterator<Map.Entry<String , String>> it = countries.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


            for (Map.Entry<String ,String> entry1 : countries.entrySet()){
                System.out.println(entry1.getKey() + ":" + entry1.getValue());
            }

            countries.forEach((k,v) -> System.out.println(k =":" +v));

            Map<String , String> countries2 = Map.of("Gr","Greece","FR","France"); //JDK9






    }
}
