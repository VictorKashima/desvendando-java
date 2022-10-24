package Polimorfismo;

public class ClinicaExec {
    public static void main(String args[]) {
        Gato miau = new Gato();
        miau.setName("MIAU MIAU");
        miau.setBloodType("Sangue Nário");
        miau.setskinColor("Black");

        Catioro auau = new Catioro();
        auau.setName("AU AU");
        auau.setBloodType("Sangue Frio");
        auau.setRaca("Cachorro");

        Clinica c = new Clinica();
        c.setAddres("Casa do Chapéu");
        c.realizarCirurgia(auau);
    }
}