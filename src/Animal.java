public abstract class Animal {
    private String name;

    public Animal (String name){
        this.name = name;
    }

    abstract String makeSound();

    abstract boolean eat (String foodtype);

    abstract String showMood (boolean mood);
}
