package Sections.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapInnerProcess {

    public static void main(String args[]){

        List<Cup> cups = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            cups.add(new Cup(i, "Cup_" + i, 50.5*i));
        }

        System.out.println("=====================================================");
        Function<Cup,Double> func = new Function<Cup, Double>() {
            @Override
            public Double apply(Cup cup) {
                cup.price = cup.price*2;
                return cup.price;
            }
        };
        // Java 8 'Sections.Map' method required the Function object
        // Purpose of Sections.Map method is Type of object converts in to developer required type (tranforming data)
        cups.stream().map(func).forEach(System.out::println);



    }

}

class Cup {
    int cup_id;
    String made_by;
    double price;

    public Cup(int cup_id, String made_by, double price) {
        this.cup_id = cup_id;
        this.made_by = made_by;
        this.price = price;
    }

    public Cup() {
    }

    @Override
    public String toString() {
        return "Cup{" +
                "cup_id=" + cup_id +
                ", made_by='" + made_by + '\'' +
                ", price=" + price +
                '}';
    }
}