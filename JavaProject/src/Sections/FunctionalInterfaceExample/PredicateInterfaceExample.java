package Sections.FunctionalInterfaceExample;

import java.util.Arrays;
import java.util.List;

public class PredicateInterfaceExample {

    public static void main(String args[]) {
//        For identify behind the method process
//        Predicate<Integer> predicate = (a) -> a % 2 == 0;
//        System.out.println(predicate.test(4));

        List<Integer> list = Arrays.asList(0,1,2,3,4,5);
        list.stream().filter(a -> a % 2 == 0).forEach(a -> System.out.println("List Element " + a));

    }

}
