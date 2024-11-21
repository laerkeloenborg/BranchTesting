public class Cat extends Animal{

    public Cat (String name){
        super(name);
    }


    @Override
    public String makeSound(){
        return "miav";
    }

    @Override
    public boolean eat(String foodType){
        return true;
    }
}
