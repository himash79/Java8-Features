package Sections.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample_01 {

    public static void main(String args[]) {

        List<Laptop> laptops = Arrays.asList(
                new Laptop(1, "HP"),
                new Laptop(2, "DELL"),
                new Laptop(3, "ASUS"),
                new Laptop(4, "LENOVO"),
                new Laptop(5, "ACER")
        );

        laptops.forEach(System.out::println);
        // parsing 'println' method as a parameter.

    }

}

class Laptop {
    int lap_id;
    String model;

    public Laptop(int lap_id, String model) {
        this.lap_id = lap_id;
        this.model = model;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lap_id=" + lap_id +
                ", model='" + model + '\'' +
                '}';
    }
}
