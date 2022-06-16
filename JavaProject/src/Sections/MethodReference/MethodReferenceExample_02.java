package Sections.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample_02 {

    public static void main(String[] args) {

        boolean increase = false; // If price increase change the mobiles price

        List<Mobile> mobiles = Arrays.asList(
                new Mobile(1, "Oneplus", 1000),
                new Mobile(2, "Apple", 2000),
                new Mobile(3, "Sony", 3000),
                new Mobile(4, "Oppo", 4000),
                new Mobile(5, "Nokia", 5000)
        );


        mobiles.forEach(MethodReferenceExample_02::display);

    }

    public static void display(Mobile mobiles) {
        System.out.println(mobiles);
    }
}

class Mobile {
    int mobile_id;
    String brand;
    double price;

    public Mobile(int mobile_id, String brand, double price) {
        this.mobile_id = mobile_id;
        this.brand = brand;
        this.price = price;
    }

    public Mobile() {
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobile_id=" + mobile_id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
