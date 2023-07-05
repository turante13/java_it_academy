package classroom.class_29_04;

public class SimpleGen {
}

class TwoGen <T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes(){
        System.out.println("Type T");
        System.out.println();
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}
