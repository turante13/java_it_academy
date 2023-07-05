package classroom.class_16_05;

interface B {
    String ab(String str);
}
public class Main2 implements B {
    @Override
    public String ab(String str){
        return String.valueOf(str.length());
    }

    public static void main(String[] args) {
        B b = new Main2();
        B b2 = (d) -> String.valueOf((d.length()));
    }
}
