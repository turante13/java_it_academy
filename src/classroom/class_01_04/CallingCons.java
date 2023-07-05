package classroom.class_01_04;

public class CallingCons {
    class A {
        A(){
            System.out.println("in A");
        }
    }

    class B extends A {
        B(){
            System.out.println("in B");
        }
    }

    class C {
        C(){
            System.out.println("in C");
        }
    }
}
