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

    @Override
    public String showMood(boolean mood){
        if (mood == true){
            return "spinder";
        } else if (mood == false){
            return "hvæser";
        }
        return "";
    }

    @Override
    public String jump(double distance){
        return "Katten hopper";
    }

}
