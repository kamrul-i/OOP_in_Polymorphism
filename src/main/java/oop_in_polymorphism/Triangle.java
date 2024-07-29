package oop_in_polymorphism;

public class Triangle extends Shape {
    //এখানে ৪টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।। 
    //if you extends a class, everything in that class comes, although it isn't visible.

    // it is variable
    double base, hight;

    //it is constructor
    Triangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }

    @Override
    double area() {
        System.out.print("Area of Triangle : ");
        return 0.5 * base * hight;
    }
}
