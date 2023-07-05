package homework.hw_13_04;

public interface IAnimal {
    public void eat();
    public void move();
}

class Dog implements IAnimal{
    @Override
    public void eat(){
        System.out.println("Eat food");
    }

    @Override
    public void move(){
        System.out.println("Move and run fast");
    }

    public static void main(String[] args) {
        Dog terrier = new Dog();
        terrier.eat();
        terrier.move();
    }
}
