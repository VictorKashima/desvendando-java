package BaterPonto;

public class Deployee {
    private String cargo;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    void show() {
        System.out.println(this.cargo);
    }

}