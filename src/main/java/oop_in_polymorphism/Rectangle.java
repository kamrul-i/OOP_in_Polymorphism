package oop_in_polymorphism;

public class Rectangle extends Shape {
    //এখানে ৪টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।। 
    //if you extends a class, everything in that class comes, although it isn't visible.

    // it is variable
    double length, width;

    //it is constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        System.out.print("Area of Rectangle : ");
        return length * width;
    }
}
