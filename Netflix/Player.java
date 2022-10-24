package Netflix;

public class Player {
    private String brand;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String a) {
        this.brand = a;
    }

    void play(Content a) {
        System.out.println("Playing: "+a.getName());
    }

}
