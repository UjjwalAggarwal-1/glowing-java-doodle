import bank.*;
 
class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("writing with my "+this.color+" pen.");
    }
}

class Student {
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(String Name, int Age){
    //     System.out.println("aagya, aagya COnsTruCtoR");
    //     this.name = Name;
    //     this.age = Age;
    // }
    Student (Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
    Student (){

    }

}

public class OOPS {
    public static void main(String args[]){
        Pen pen = new Pen();
        pen.color = "blue";
        pen.type = "gel";
        pen.write();
        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "gel";
        pen2.write();

        Student stu = new Student();
        stu.name="ujjwal";
        stu.printName();
        Student s2 = new Student(stu);
        s2.printName();

        //packages ka example
        System.out.println(bank.Bank.class);
    }
}