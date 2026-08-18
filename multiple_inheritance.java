// Multiple Inheritance using Interfaces in Java

interface Animal {
    void eat();
    void sleep();
}

interface Swimmer {
    void swim();
    void dive();
}

interface Flyer {
    void fly();
    void land();
}

// Class implementing multiple interfaces
class Duck implements Animal, Swimmer, Flyer {
    
    @Override
    public void eat() {
        System.out.println("Duck is eating grains and water plants");
    }
    
    @Override
    public void sleep() {
        System.out.println("Duck is sleeping with eyes half-open");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water");
    }
    
    @Override
    public void dive() {
        System.out.println("Duck is diving to catch fish");
    }
    
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky");
    }
    
    @Override
    public void land() {
        System.out.println("Duck is landing on the ground");
    }
}

// Another example of multiple inheritance
class SuperHero implements Animal, Flyer {
    String name;
    
    SuperHero(String name) {
        this.name = name;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is eating pizza");
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " sleeps in the fortress");
    }
    
    @Override
    public void fly() {
        System.out.println(name + " is flying with superpowers");
    }
    
    @Override
    public void land() {
        System.out.println(name + " lands gracefully");
    }
}

public class multiple_inheritance {
    
    public static void main(String[] args) {
        // Duck example
        System.out.println("=== Duck Demo ===");
        Duck duck = new Duck();
        duck.eat();
        duck.sleep();
        duck.swim();
        duck.dive();
        duck.fly();
        duck.land();
        
        System.out.println("\n=== SuperHero Demo ===");
        SuperHero hero = new SuperHero("Superman");
        hero.eat();
        hero.sleep();
        hero.fly();
        hero.land();
    }
}
