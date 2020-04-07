package kotlin_practice;

public class Student2 {

    String name;
    int roll;

    Student2(String name, int roll){ // This constructor we can initialize her body
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println(name);
        System.out.println(roll);
    }

    public static void main(String[] args) {
        Student2 strd = new Student2("Polash",350883);
        strd.display();
    }
}
