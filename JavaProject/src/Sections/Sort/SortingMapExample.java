package Sections.Sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingMapExample {

    public static void main(String args[]) {

        Map<Integer, Person> person_map = new HashMap<>();

        for(int i=1; i<=5; i++) {
            person_map.put(i, new Person(i, "Person_" + i, 10*i));
        }

        System.out.println("===========================ORDER BY KEY===========================");
        person_map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println("===========================ORDER BY PERSON OBJECT===========================");
        person_map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Person::getP_id)))
                .forEach(System.out::println);
        System.out.println("===========================ORDER BY PERSON OBJECT REVERED===========================");
        person_map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Person::getP_id).reversed()))
                .forEach(System.out::println);
        System.out.println("===========================ORDER BY PERSON AGE===========================");
        person_map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Person::getAge)))
                .forEach(System.out::println);
    }

}

class Person {
    private int p_id;
    private String name;
    private int age;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int p_id, String name, int age) {
        this.p_id = p_id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "p_id=" + p_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}