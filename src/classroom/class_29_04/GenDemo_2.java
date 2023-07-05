package classroom.class_29_04;

class GenDemo_2 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(90);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("M: " + v);
        System.out.println();
        Gen<String> strOb = new Gen<>("Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("M: " + str);

    }
}
class Gen <E> {
    E ob;
    public Gen(E ob){
        this.ob = ob;
    }
    public E getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Type E is" + ob.getClass().getName());
    }
}
