package Sections.Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample_01 {

    public static void main(String args[]) {
        //  List example
        List<User> users = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            users.add(new User(i , "user_" + i));
        }
        // -> is lambda expression then doesn't use developer code like 'inner process' code segment.
        users.forEach(user -> System.out.println(user));

        System.out.println("============================================================================================");
        // forEach() method inner process.
        Consumer<User> u = new Consumer<User>() {

            @Override
            public void accept(User user) { //
                System.out.println(user);
            }
        };
        // forEach() method required Consumer Object and data type then call accept() method for print data or continue function.
        users.forEach(u);

    }
}

class User {
    int user_id;
    String username;

    public User(int user_id, String username) {
        this.user_id = user_id;
        this.username = username;
    }

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                '}';
    }
}