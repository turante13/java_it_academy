package Practise.practise_12_04_interface;

public interface Phones {
    public void cost();
    public void model();
}

class Iphone implements Phones{
    @Override
    public void cost(){
        System.out.println("$1000");
    }

    @Override
    public void model() {
        System.out.println("iPhone 14");
    }
}

class Samsung implements Phones{
    @Override
    public void cost(){
        System.out.println("$1300");
    }
    @Override
    public void model(){
        System.out.println("Z Fold 4");
    }
}

class Om{
    public static void main(String[] args){
        Iphone iphone1 = new Iphone();
        Samsung samsung1 = new Samsung();
        iphone1.cost();
        iphone1.model();
        samsung1.cost();
        samsung1.model();
    }
}
