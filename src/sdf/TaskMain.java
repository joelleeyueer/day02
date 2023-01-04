package src.sdf;

import java.util.*;

public class TaskMain {

    public static void main(String[] args) {
        List<Car> garage = new LinkedList<>();
        Set<String> names = new HashSet<>();
        Map<String, Integer> debts = new HashMap<>();

        //Add some cars
        garage.add(new Car());
        garage.add(new Porsche());
        System.out.println(garage);

        names.add("Joel");
        System.out.println(names);

        debts.put("Fred", 10);
        debts.put("Fred", 100);
        System.out.println(debts);

    }

}
