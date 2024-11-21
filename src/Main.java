public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Hannibal");
        Cat cat = new Cat("Garfield");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());

        System.out.println(dog.eat("meat"));
        System.out.println(cat.eat("fish"));

        System.out.println(dog.showMood(true));
        System.out.println(cat.showMood(false));

    }

}
