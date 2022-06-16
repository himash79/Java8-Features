package Sections.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample01 {

    public static void main(String args[]) {

        List<Integer> intList = Arrays.asList(1,1,2,3,4,4,5,6,7,7,8,9,9);
        System.out.println("Non filtered new list : " + intList);
        System.out.println("=============================================================");
        List<Integer> filteredNo = intList.stream().distinct().collect(Collectors.toList());
        System.out.println("Filtered new list : " + filteredNo);
        System.out.println("=============================================================");
        Long elementCount = intList.stream().count();
        System.out.println("List element count : " + elementCount);
        System.out.println("=============================================================");
        Long filteredElementCount = intList.stream().distinct().count();
        System.out.println("Filtered list element count : " + filteredElementCount);
        System.out.println("=============================================================");


    }

}
