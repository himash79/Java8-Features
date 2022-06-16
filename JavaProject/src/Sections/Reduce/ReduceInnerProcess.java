package Sections.Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceInnerProcess {

    public static void main(String args[]) {

        List<Mouse> mList = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            mList.add(new Mouse(i, "Mouse Brand_" + i, 1000.0*i));
        }

        BinaryOperator<Double> b = new BinaryOperator<Double>() {
            @Override
            public Double apply(Double aDouble, Double aDouble2) {
                return aDouble + aDouble2;
            }
        };
        // Java 8 'Sections.Reduce' method required BinaryOperation object.
        // Purpose of Sections.Reduce method can perform numeric calculations.
        System.out.println(mList.stream().map(mouse -> mouse.price).reduce(0.0,b));

        Double sumOfGTThan = mList.stream().filter(mouse -> mouse.price > 3000)
                            .map(mPrice -> mPrice.price)
                            .reduce(0.0,(c,e) -> c+e);
//                            .reduce(Double::sum).get(); // possible way also
        System.out.println(sumOfGTThan);
    }

}

class Mouse {
    int m_id;
    String brand;
    double price;

    public Mouse(int m_id, String brand, double price) {
        this.m_id = m_id;
        this.brand = brand;
        this.price = price;
    }

    public Mouse() {
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "m_id=" + m_id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
