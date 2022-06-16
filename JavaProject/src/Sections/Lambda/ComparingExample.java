package Sections.Lambda;

import java.util.Comparator;

public class ComparingExample {

    public static void main(String args[]) {

        Comparator<Integer> comparedValue = (value1, value2) -> value1.compareTo(value2);

        System.out.println(comparedValue.compare(1, 1));
    }

}
