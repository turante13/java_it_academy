package classroom.class_20_04;

enum Season {
    SPRING("ВЕСНА"), SUMMER("ЛЕТО"), FALL("ОСЕНЬ"), WINTER("ЗИМА");

    private String translate;
    Season(String translate) {
        this.translate = translate;
    }

    public String getTranslate(){
        return translate;
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(Season.WINTER.getTranslate());
    }
}
