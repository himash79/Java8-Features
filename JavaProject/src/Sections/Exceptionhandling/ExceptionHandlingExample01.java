package Sections.Exceptionhandling;

import java.util.Arrays;
import java.util.List;

public class ExceptionHandlingExample01 {

    public static void main(String[] args) {

        List<String> intList = Arrays.asList("1","2","hgf");

        intList.forEach(ExceptionHandlingExample01::printDetails);

    }

    public static void printDetails(String value) {
        try {
            System.out.println(Integer.parseInt(value));
        }catch(Exception ex) {
            System.out.println("Exception : " + ex.getMessage());
        }
    }

}
