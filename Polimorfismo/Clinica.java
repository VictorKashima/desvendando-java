package Polimorfismo;

public class Clinica {
    private String addres;

    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }

    void realizarCirurgia(Animal a) {
        System.out.println("Cirurgiando: "+a.getName());
    }
    
}
