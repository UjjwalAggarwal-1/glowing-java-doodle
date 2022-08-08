interface Animal{
    int eyes = 2; //public static final
    void walk();
    public void eat();
}

interface Herbivore{
    void walk();
}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walking horse");
    }
    public void eat(){
        System.out.println("eating horse");
    }
}

public class Interface {
    public static void main(String [] args){
        Horse hw = new Horse();
        hw.walk();
        hw.eat();
        System.out.println(Animal.eyes);
        System.out.println(hw.eyes);
    }
}