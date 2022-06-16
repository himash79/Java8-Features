package Sections.BiFunionalInterfaceExample;

import java.util.HashMap;
import java.util.Map;

public class BiConsumerInterfaceExample01 {

    public static void main(String[] args) {

        Map<String,Integer> users = new HashMap<>();
        users.put("User_01", 1000);
        users.put("User_02", 2000);
        users.put("User_03", 3000);
        users.put("User_04", 4000);
        users.put("User_05", 5000);

        users.forEach((key,value) -> System.out.println(key + " : " + value));


    }

}
