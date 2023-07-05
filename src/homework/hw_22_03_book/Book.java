package homework.hw_22_03_book;

public class Book {
    String name;
    int age;
    String author;

    public Book(String name, int age, String author){
        this.name = name;
        this.age = age;
        this.author = author;
    }

    public String compareBook(String a, int b, String c){
        return a + " " + b + " " + c;
    }

    public static void main(String[] args){
        Book book1 = new Book("Mumu", 1903,"Jalyn");
        Book book2 = new Book("Gugo", 1507,"Jantai");

        System.out.println(book2);
        System.out.println(book1.compareBook("Cowan", 1896, "Log"));
    }
}
