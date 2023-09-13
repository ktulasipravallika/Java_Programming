package InnerClass.AnonymousInnerClass;

public class AnonymousInnerClass {

    int x= 20;
    void display() {

        ClassAbstract ca = new ClassAbstract() {
            void display() {
                System.out.println("Hi, this is anonymous inner class method ");
            }
        };
        ca.display();

        new ClassAbstract() {
            void display() {
                System.out.println("Hi, this is anonymous inner class method ");
            }
        }.display();// same as above lines..without reference
    }
}
