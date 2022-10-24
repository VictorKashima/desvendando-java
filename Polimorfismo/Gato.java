package Polimorfismo;

public class Gato extends Mamifero{
    private String skinColor;

    public String getskinColor() {
        return skinColor;
    }
    public void setskinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    void miar() {
        System.out.println("MIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAU");
    }

}
