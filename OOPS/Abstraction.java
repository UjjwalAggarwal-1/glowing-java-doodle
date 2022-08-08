abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("animal eating done");
    }
    Animal(){
        System.out.println("Animal created");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eat(){
        System.out.println("animal viz horse eating done");
    }
    Horse(){
        System.out.println("Its a Horse");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


public class Abstraction{
    public static void main(String [] args){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}