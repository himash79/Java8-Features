package Sections.BiFunionalInterfaceExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionInterfaceExample01 {

    public static void main(String[] args) {

        Map<String,Integer> users = new HashMap<>();
        users.put("User_01", 1000);
        users.put("User_02", 2000);
        users.put("User_03", 3000);
        users.put("User_04", 4000);
        users.put("User_05", 5000);

        System.out.println("INITIAL MAP DATA");
        System.out.println(users);

        BiFunction<String,Integer,Integer> inc_salary = (key, value) -> value + 1500;

        users.replaceAll(inc_salary);
        System.out.println("AFTER MODIFIED DATA");
        System.out.println(users);

    }

}
