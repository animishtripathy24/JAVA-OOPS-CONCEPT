import java.util.*;

abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

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
}

class Mammal extends Animal {
    private String habitat;

    Mammal(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void displayHabitat() {
        System.out.println(getName() + " lives in " + habitat);
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Mammal sound");
    }
}

class Bird extends Animal {
    private double wingspan;

    Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println(getName() + " is flying with a wingspan of " + wingspan + " meters");
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Bird sound");
    }
}

class Reptile extends Animal {
    private double length;

    Reptile(String name, int age, double length) {
        super(name, age);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void crawl() {
        System.out.println(getName() + " is crawling with a length of " + length + " meters");
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Reptile sound");
    }
}

class Dog extends Mammal {
    private String breed;

    Dog(String name, int age, String habitat, String breed) {
        super(name, age, habitat);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " the " + breed + " is barking");
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Dog sound");
    }
}

class Elephant extends Mammal {
    private double tuskLength;

    Elephant(String name, int age, String habitat, double tuskLength) {
        super(name, age, habitat);
        this.tuskLength = tuskLength;
    }

    public double getTuskLength() {
        return tuskLength;
    }

    public void setTuskLength(double tuskLength) {
        this.tuskLength = tuskLength;
    }

    public void trumpet() {
        System.out.println(getName() + " the elephant is trumpeting with tusk length " + tuskLength + " meters");
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Elephant sound");
    }
}

class Eagle extends Bird {
    private String prey;

    Eagle(String name, int age, double wingspan, String prey) {
        super(name, age, wingspan);
        this.prey = prey;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }

    public void hunt() {
        System.out.println(getName() + " the eagle is hunting for " + prey);
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Eagle sound");
    }
}

class Penguin extends Bird {
    private double swimmingSpeed;

    Penguin(String name, int age, double wingspan, double swimmingSpeed) {
        super(name, age, wingspan);
        this.swimmingSpeed = swimmingSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public void swim() {
        System.out.println(getName() + " the penguin is swimming with a speed of " + swimmingSpeed + " km/h");
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Penguin sound");
    }
}

class Snake extends Reptile {
    private boolean venomous;

    Snake(String name, int age, double length, boolean venomous) {
        super(name, age, length);
        this.venomous = venomous;
    }

    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    public void bite() {
        System.out.println(getName() + " the snake is biting");
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Snake sound");
    }
}

class Turtle extends Reptile {
    private String shellPattern;

    Turtle(String name, int age, double length, String shellPattern) {
        super(name, age, length);
        this.shellPattern = shellPattern;
    }

    public String getShellPattern() {
        return shellPattern;
    }

    public void setShellPattern(String shellPattern) {
        this.shellPattern = shellPattern;
    }

    public void hideHead() {
        System.out.println(getName() + " the turtle is hiding its head under the " + shellPattern + " shell");
    }

    public void makeSound() {
        System.out.println("The Sound of the animal is : Turtle sound");
    }
}

public class Zoo {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Zoo!");
        Dog dog = new Dog("Goldy", 3, "Land", "Golden Retriever");
        Elephant elephant = new Elephant("Jumbo", 10, "Grasslands", 2.5);
        Eagle eagle = new Eagle("Cheel", 5, 2.0, "Fish");
        Penguin penguin = new Penguin("Chilly", 2, 0.8, 10.0);
        Snake snake = new Snake("Python", 4, 1.5, true);
        Turtle turtle = new Turtle("torty", 8, 0.3, "Checkerboard");

        System.out.println("Interacting with the dog...");
        dog.displayHabitat();
        dog.bark();
        dog.makeSound();

        System.out.println("\nInteracting with the elephant...");
        elephant.displayHabitat();
        elephant.trumpet();
        elephant.makeSound();

        System.out.println("\nInteracting with the eagle...");
        eagle.fly();
        eagle.hunt();
        eagle.makeSound();

        System.out.println("\nInteracting with the penguin...");
        penguin.fly();
        penguin.swim();
        penguin.makeSound();

        System.out.println("\nInteracting with the snake...");
        snake.crawl();
        snake.bite();
        snake.makeSound();

        System.out.println("\nInteracting with the turtle...");
        turtle.crawl();
        turtle.hideHead();
        turtle.makeSound();

        System.out.println("\nThank you for visiting the Zoo!");
    }
}
