package Sections.Reduce;

import java.util.ArrayList;
import java.util.List;

public class ReduceMethodExample_01 {

    public static void main(String args[]) {

        List<Mouse> mouses = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            mouses.add(new Mouse(i, "Mouse Brand_" + i, 1000.0*i));
        }

        Double sum_01 = mouses.stream().map(mouse -> mouse.price).reduce(0.0,(c,e) -> c+e);
        System.out.println(sum_01);
        System.out.println("================================================================================");

        // Separate way 01
        Double sum_02 = mouses.stream().map(mouse -> mouse.price).reduce(0.0,(c,e) -> Double.sum(c,e));
        System.out.println(sum_02);
        System.out.println("================================================================================");

        // Separate way 02
        Double sum_03 = mouses.stream().map(mouse -> mouse.price).reduce(0.0,Double::sum);
        System.out.println(sum_03);

    }

}
