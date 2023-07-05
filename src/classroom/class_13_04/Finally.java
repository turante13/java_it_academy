package classroom.class_13_04;

public class Finally {
    static void procA(){
        try{
            System.out.println("procA() in body");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("operator block finally in procA");
        }
    }

    static void procB(){
        try{
            System.out.println("procB() in body");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("finally block operator in procB");
        }
    }

    static void procC(){
        try{
            System.out.println("procC() in body");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("finally block operator in procC");
        }
    }

    public static void main(String[] args){
        try{
            procA();
        }catch (Exception e){
            System.out.println("exception caught");
            procB();
            procC();
        }
    }
}
