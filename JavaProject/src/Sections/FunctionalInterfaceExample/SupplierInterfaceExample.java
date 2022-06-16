package Sections.FunctionalInterfaceExample;

import java.util.Arrays;
import java.util.List;

public class SupplierInterfaceExample {

    public static void main(String args[]) {
//        For identify behind the method process
//        Supplier<String> supplier = () -> "Hi Im Yomal Himasha";
//        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi Im Papaya"));

    }

}
