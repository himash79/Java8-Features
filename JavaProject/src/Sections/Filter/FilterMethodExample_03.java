package Sections.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMethodExample_03 {

    public static void main(String args[]) {

        List<Book> books = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            books.add(new Book(i, "Book_" + i, 150.0*i));
        }
        // Instead of lambda expression who can use methods also
        Double value = books.stream().map(book -> book.price)
                .filter(FilterMethodExample_03::isDivisible)
                .map(FilterMethodExample_03::mappedValue)
                .findFirst()
                .orElse(0.0);

        System.out.println(value);

    }

    public static Boolean isDivisible(Double value) {
        return value%5 == 0;
    }

    public static Double mappedValue(Double value) {
        return value * 2;
    }

}
