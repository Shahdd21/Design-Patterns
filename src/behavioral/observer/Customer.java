package behavioral.observer;

import java.util.*;

public class Customer implements Subscriber{
    private String name;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void notify(String message) {
        System.out.println("Notifying user: " + name + " about: " + message);
    }
}
