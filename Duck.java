package Kath;

public class Duck {

    private String name;
    private int lifeExpectancy;
    private String favoriteFood;

    Duck(String name, int lifeExpectancy, String favoriteFood) {

        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favoriteFood = favoriteFood;

    }

    void waddle() {
        System.out.println("waddlee");

    }

    void quack() {

        System.out.println("quackkkkk");

    }

    public String toString() {

        return "My name is " + name.toUpperCase() + " \nmy favorite food is " + favoriteFood.toUpperCase()
                + " \nmy life is expectancy is "
                + lifeExpectancy;
    }

    public static void main(String[] args) {

        Duck duck1 = new Duck("ivo", 12, "fish");
        System.out.println(duck1);
        System.out.println("\n");
        Duck duck2 = new Duck("bob", 13, "meat");
        System.out.println(duck2);
    }
}
