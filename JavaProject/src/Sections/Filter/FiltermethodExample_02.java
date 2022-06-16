package Sections.Filter;

import java.util.ArrayList;
import java.util.List;

public class FiltermethodExample_02 {

    public static void main(String args[]) {

        List<Book> books = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            books.add(new Book(i, "Book_" + i, 150.0*i));
        }

        Double value = books.stream().map(book -> book.price)
                                   .filter(price -> price%5 == 0)
                                   .map(filtered_price -> filtered_price*2)
                                   .findFirst()
                                   .orElse(0.0);

        System.out.println(value);

        }

}
