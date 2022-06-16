package Sections.Optional;

import java.util.ArrayList;
import java.util.List;

public class OptionalExample {

    public static Constructors getAll(String name) {
        List<Constructors> consList = new ArrayList<>();
        consList.add(new Constructors(1, "MAGA", 1000.0));
        consList.add(new Constructors(2, "HELA", 2000.0));
        consList.add(new Constructors(1, "HELIES", 1500.0));
        consList.add(new Constructors(1, "TRISP", 600.0));
        consList.add(new Constructors(1, "ACCESS", 9000.0));
        return consList.stream().filter(conName -> conName.getName().equals(name)).findAny().orElse(new Constructors());
    }

    public static void main(String[] args) {

        Constructors currCons = getAll("MAGA");
        System.out.println(currCons);

    }

}

class Constructors {
    private int consId;
    private String name;
    private double price;

    public int getConsId() {
        return consId;
    }

    public void setConsId(int consId) {
        this.consId = consId;
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

    public Constructors(int consId, String name, double price) {
        this.consId = consId;
        this.name = name;
        this.price = price;
    }

    public Constructors() {
    }

    @Override
    public String toString() {
        return "Constructors{" +
                "consId=" + consId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}