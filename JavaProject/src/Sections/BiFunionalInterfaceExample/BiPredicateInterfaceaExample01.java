package Sections.BiFunionalInterfaceExample;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceaExample01 {

    public static void main(String[] args) {

        BiPredicate<String, String> pred = (s1, s2) -> s1.equals(s2);
        System.out.println(pred.test("user","User"));

        BiPredicate<String, String> pred2 = (s1, s2) -> s1.length() == s2.length();
        System.out.println(pred2.test("user","User"));

    }

}
