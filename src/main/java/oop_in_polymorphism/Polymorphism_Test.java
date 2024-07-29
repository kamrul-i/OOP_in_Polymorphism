package oop_in_polymorphism;
public class Polymorphism_Test {

    //এখানে ৪টি class use করা হয়েছে, main class থেকে অন্য class-গুলোকে call করা হয়েছে।।
    public static void main(String[] args) {

        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();
    }
    /*
    সকল sub-class ১টি super-class-কে extends/inherit করেছে, এরকম inherit-কে Hierarchical inheritance বলে।।
    super class এর variable দ্বারা সকল ‍sub-class এর object কে declare করা যায়।। এটাই হলো polymorphism.
     */
}
