class student1{
    int age;
    String name;
    public student1(){
        this(20,"Rohit");
        System.out.println("Control in default constructor");
        age=19;
        name="Rahul";
    }
    public student1(int age){
        this();
        System.out.println("Control in int constructor");
        this.age=age;
        name="rohit";
    }
    public student1(int age, String name){
        System.out.println("Control in int and string constructor");
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println(age);
        System.out.println(name);
    }
}

public class this_super {
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.display();
        student1 s2 = new student1(18);
        s2.display();
        student1 s3 = new student1(19,"Rohit");
        s3.display();
        
    }
}
