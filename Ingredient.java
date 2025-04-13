public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    Ingredient(){

    }

    Ingredient(double amount, String unit, String name){
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    /// //////////////////////////////////////
    void setAmount(double amount){
        this.amount = amount;
    }

    double getAmount(){
        return amount;
    }
    /// //////////////////////////////////////

    void setUnit(String unit){
        this.unit = unit;
    }

    String getUnit(){
        return unit;
    }
    /// //////////////////////////////////////
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
