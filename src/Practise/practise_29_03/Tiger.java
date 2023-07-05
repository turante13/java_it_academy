package Practise.practise_29_03;

public class Tiger extends Animals {
    private String color;

    public Tiger(boolean veg, String food, int legs){
        super(veg, food, legs);
        this.color = "Orange";
    }

    public Tiger(boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
