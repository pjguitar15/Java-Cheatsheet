public class BloodData {
    private String bloodType; // accepts O, A, B, and AB
    private String rhFactor; // Rhesus factor; accepts + and -

    // default constructor that does not accept anything
    public BloodData(){
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    // overloaded constructor that accepts bt and rh
    public BloodData(String bt, String rh){
        this.bloodType = bt;
        this.rhFactor = rh;
    }

    // display method
    public String display(){
        return bloodType + rhFactor + " is added to the blood bank";
    }
}
