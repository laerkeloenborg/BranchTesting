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

    @Override
    public String showMood(boolean mood){
        if (mood == true){
            return "logrer";
        } else if (mood == false){
            return "knurrer";
        }
        return "";
    }

}
