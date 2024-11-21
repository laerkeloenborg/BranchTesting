public class Dog extends Animal {

    public Dog (String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return "vuf vuf";
    }

    @Override
    public boolean eat(String foodType){
        return true;
    }

}
