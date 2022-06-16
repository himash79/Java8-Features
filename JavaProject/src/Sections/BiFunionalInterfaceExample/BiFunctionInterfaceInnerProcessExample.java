package Sections.BiFunionalInterfaceExample;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionInterfaceInnerProcessExample {

    public static void main(String[] args) {

        List<Integer> list1 = Stream.of(1,2,3,4,5).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(7,6,8,9,8,10,12,11).collect(Collectors.toList());

        // In this case BiFunction interface done similar process of Function interface but BiFunction interface take one more
        // additional parameter
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunc = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> intList1, List<Integer> intList2) {
                return Stream.of(intList1, intList2)
                        .flatMap(List::stream)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
            }
        };
        System.out.println(biFunc.apply(list1, list2));
    }

}
