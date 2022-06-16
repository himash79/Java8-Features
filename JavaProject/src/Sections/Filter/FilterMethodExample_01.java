package Sections.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMethodExample_01 {

    public static void main(String args[]) {

        List<Book> books = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            books.add(new Book(i, "Book_" + i, 150.0*i));
        }

        Double sum = books.stream().map(book -> book.price).filter(price -> price%5 == 0).reduce(0.0,(c,e) -> c+e);
        System.out.println(sum);
    }

}