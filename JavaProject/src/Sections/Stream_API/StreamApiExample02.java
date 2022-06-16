package Sections.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample02 {

    public static void main(String[] args) {

        List<Bottle> bottles = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            bottles.add(new Bottle(i, "Bottle_" + i, i*100));
        }
        System.out.println("=========================================================================");
        System.out.println(bottles.stream().map(bottle -> bottle).collect(Collectors.toList()));
        System.out.println("=========================================================================");
        System.out.println(bottles.stream().map(bottle -> bottle.price*2).collect(Collectors.toList()));
    }

}

class Bottle {
    int bottle_id;
    String name;
    double price;

    public Bottle(int bottle_id, String name, double price) {
        this.bottle_id = bottle_id;
        this.name = name;
        this.price = price;
    }

    public Bottle() {
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "bottle_id=" + bottle_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}