package gr.uaeb.cf.ch19.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("oranges",8.5,10),
                new Product("Milk", 2.5,5),new Product("Honney",12.5,115)));

        Collections.sort(products);
        products.forEach(System.out::println);

        Collections.reverse(products);
        products.forEach(System.out::println);

        Collections.sort(products,Comparator.naturalOrder());
        products.sort(Comparator.naturalOrder());
        products.sort(Comparator.reverseOrder());


        products.sort(Comparator.comparing(Product::getDescription));

        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity).reversed());


        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice,(a1,a2)->Double.compare(a2,a1)));

        List<Product> lengthFiltered = products.stream()
                .filter(product -> product.getDescription().length() <= 5) //predicate
                .collect(Collectors.toList());

        lengthFiltered.forEach(System.out::println);


        List<Product> appleList = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparing(Product::getQuantity))
                .collect(Collectors.toList());

        Set<String>cities = new HashSet<>(List.of("Athens", "Berlin","Moscow"));

        Set<String>nonGreekCIties = cities.stream()
                .filter(city -> !city.equals("Athens"))
                    .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        List<Product> updatedProdutPrices = products.stream()
                .map(p -> new Product(p.getDescription(),p.getPrice()+p.getPrice()*0.1,p.getQuantity()))
                .collect(Collectors.toList());

        int sumOfQuantities = products.stream()
                .filter(p -> p.getDescription().equals("Apples"))
                .reduce(0,(total,e)-> total + e.getQuantity(),Integer::sum);

        int sumOfQuantities2 = products.stream()
                .filter(pro -> pro.getDescription().equals("Apples"))
                .mapToInt(Product::getQuantity)
                .sum();

        List<Product> newProducts = Arrays.asList(new Product("oranges",8.5,10),
                new Product("Milk", 2.5,5),new Product("Honney",12.5,115));


        List<String> productDescriptions = products.stream()
                .filter(p -> p.getQuantity() >=1)
                .map(Product::getDescription)
                .sorted()
                .collect(Collectors.toList());


    }
}
