package Sections.BiFunionalInterfaceExample;

import java.util.function.BiPredicate;

public class BiPredicateFuntionInterfaceInnerProcessExample {

    public static void main(String[] args) {

        BiPredicate<String, String> biPred = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        // In this case BiPredicate interface done similar process of Predicate interface but BiPredicate interface take one more
        // additional parameter
        System.out.println(biPred.test("user","user"));

    }

}
