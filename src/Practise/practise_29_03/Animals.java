package Practise.practise_29_03;

public class Animals {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;
    public Animals(){

    }
    public Animals(boolean veg, String food, int legs){
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }

    public String getEats(){
        return eats;
    }
    public void setEats(String eats) {
        this.eats = eats;
    }
    public int getNoOfLegs(){
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
