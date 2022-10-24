package Polimorfismo;

public class Mamifero extends Animal {

    private String bloodType;

    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    void mamar() {
        System.out.println("Mamando hmmmm");
    }

}
