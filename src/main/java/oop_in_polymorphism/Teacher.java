package oop_in_polymorphism;

public class Teacher extends Person {
    //এখানে ৪টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।। 
    //if you extends a class, everything in that class comes, although it isn't visible.

    @Override
    void display() {
        System.out.println("Teacher class, It is sub-class.");
    }
}
