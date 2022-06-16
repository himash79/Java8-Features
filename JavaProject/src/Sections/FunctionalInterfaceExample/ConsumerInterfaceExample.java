package Sections.FunctionalInterfaceExample;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterfaceExample {

    public static void main(String args[]) {
//        For identify behind the method process
//        Consumer<Integer>  consumer = (t) -> System.out.println("TEST CONSUMER INTERFACE : " + t);
//        consumer.accept(10);

        List<Integer> list = Arrays.asList(0,1,2,3,4,5);
        list.stream().forEach(a -> System.out.println("TEST CONSUMER " + a));

    }

}
