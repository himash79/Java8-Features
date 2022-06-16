package Sections.BiFunionalInterfaceExample;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceInnerProcessExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biCon = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println("s : " + s + " | s2 : " + s2);
            }
        };

        // In this case BiConsumer interface done similar process of Consumer interface but BiConsumer interface take one more
        // additional parameter
        biCon.accept("Hello", "my World");

    }

}
