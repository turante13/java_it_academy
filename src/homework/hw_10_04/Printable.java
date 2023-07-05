package homework.hw_10_04;

public interface Printable {
    public void print();

}

class Book implements Printable{
    @Override
    public void print(){
        System.out.println("Book printing.");
    }

}
class Magazine implements Printable{
    @Override
    public void print(){
        System.out.println("Magazine printing.");
    }
}
class Newspaper implements Printable{
    @Override
    public void print(){
        System.out.println("Newspaper printing.");
    }
}

class Chakra{
    public static void main(String[] args){
        Book book_1 = new Book();
        Magazine magazine_1 = new Magazine();
        Newspaper newspaper_1= new Newspaper();
        book_1.print();
        magazine_1.print();
        newspaper_1.print();
    }
}
