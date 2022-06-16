package Sections.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample_01 {

    public static void main(String args[]) {

        System.out.println("BOOK SORTED ASC : " + new BookService().SortedBooksASC());
        System.out.println("BOOK SORTED DESC : " + new BookService().sortedBookDESC());

    }

}

class BookService {

    public List<Book> SortedBooksASC() {
        List<Book> list = new BookUtils().getBookList();
        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return list;
    }

    public List<Book> sortedBookDESC() {
        List<Book> list = new BookUtils().getBookList();
        Collections.sort(list, ( o1, o2) -> o2.getName().compareTo(o1.getName()));
        return list;
    }

}

class BookUtils {

    public List<Book> getBookList() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"Test Book 01", "ME", 1200.00));
        list.add(new Book(2,"Test Book 02", "OTH", 1400.00));
        return list;
    }

}

class Book {

    private int bookId;
    private String name;
    private String author;
    private double price;

    public Book(int bookId, String name, String author, double price) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != book.bookId) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bookId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}