package Sections.Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingListExample {

    public static void main(String args[]) {

        List<Charger> chargers = new ArrayList<>();
        chargers.add(new Charger(1, "Apple", 500.0));
        chargers.add(new Charger(2, "Samsung", 1500.0));
        chargers.add(new Charger(3, "Sony", 200.0));
        chargers.add(new Charger(4, "Oneplus", 900.0));
        chargers.add(new Charger(5, "Huawei", 800.0));


        System.out.println("===========================ORDER BY CHARGER ID===========================");
        chargers.stream()
                .sorted(Comparator.comparing(Charger::getCharge_id))
                .forEach(System.out::println);
        System.out.println("===========================ORDER BY CHARGER ID REVERED===========================");
        chargers.stream()
                .sorted(Comparator.comparing(Charger::getCharge_id).reversed())
                .forEach(System.out::println);
        System.out.println("===========================ORDER BY CHARGER PRICE REVERSER===========================");
        chargers.stream()
                .sorted(Comparator.comparing(Charger::getPrice).reversed())
                .forEach(System.out::println);

    }

}

class Charger {
    private int charge_id;
    private String name;
    private double price;

    public int getCharge_id() {
        return charge_id;
    }

    public void setCharge_id(int charge_id) {
        this.charge_id = charge_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Charger(int charge_id, String name, double price) {
        this.charge_id = charge_id;
        this.name = name;
        this.price = price;
    }

    public Charger() {
    }

    @Override
    public String toString() {
        return "Charger{" +
                "charge_id=" + charge_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}