package oop_in_polymorphism;
public class Polymorphism_Test {
    
    public static void main(String[] args) {

        //এখানে ৪টি class use করা হয়েছে, main class থেকে অন্য class-গুলোকে call করা হয়েছে।।
        //general system.-------------------------
        Shape s = new Shape();
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(21, 25);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
        //----------------------------------------
        System.out.printf("\n");

        //dynamic system.-------------------------
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(19, 26);
        Shape s3 = new Triangle(24, 27);

        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
        //----------------------------------------
        System.out.printf("\n");

        //using array system.---------------------
        Shape[] s5 = new Shape[3];
        s5[0] = new Shape();
        s5[1] = new Rectangle(17, 23);
        s5[2] = new Triangle(14, 25);

        System.out.println(s5[0].area());
        System.out.println(s5[1].area());
        System.out.println(s5[2].area());
        //----------------------------------------
        System.out.printf("\n");

        //using array & for loop system.----------
        Shape[] s4 = new Shape[3];
        s4[0] = new Shape();
        s4[1] = new Rectangle(90, 20);
        s4[2] = new Triangle(60, 55);

        //using for loop system.
        for (int i = 0; i < 3; i++) {
            System.out.println(s4[i].area());
        }
        //----------------------------------------  
    }
    /*
    সকল sub-class ১টি super-class-কে extends/inherit করেছে, এরকম inherit-কে Hierarchical inheritance বলে।।
    super class এর variable দ্বারা সকল ‍sub-class এর object কে declare করা যায়।। এটাই হলো polymorphism.
     */
}
