package main;

import entities.Human;

/**
 * Created by wookie on 5/25/16.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.doSomething("Fish");
        human.doSomething("Animal");
        human.doSomething("Mushroom");
    }
}
