package Part10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Dune", "Jack", 12));
        books.add(new Book("Matilda", "Sasha", 10));
        books.add(new Book("1984", "George Orwell", 115));

        books.sort(null);

        books.stream()
                .filter(book -> book.getRating() >= 4)
                .forEach(System.out::println);


        double average = books.stream()
                .filter(book -> book.getRating() >= 4)
                .mapToDouble(book -> book.getRating())
                .average()
                .orElse(0.0);


        System.out.printf("%.2f%n", average);



    }

    }