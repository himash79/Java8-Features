package Sections.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterInnerProcess {

    public static void main(String args[]) {

        List<Book> books = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            books.add(new Book(i, "Book_" + i, 150.0*i));
        }

        System.out.println("==================================================");
        Predicate<Double> p = new Predicate<Double>() {
            @Override
            public boolean test(Double aDouble) {
                return aDouble%5 == 0;
            }
        };
        // Java 8 'Sections.Filter' method required Predicate object.
        // Purpose of Sections.Filter method can perform conditional operations.
        Double sum = books.stream().map(book -> book.price).filter(p).reduce(0.0,(c,e) -> c+e);
        System.out.println(sum);

    }

}

class Book {
    int book_id;
    String name;
    double price;

    public Book(int book_id, String name, double price) {
        this.book_id = book_id;
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}