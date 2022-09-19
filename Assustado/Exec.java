package Assustado;

public class Exec {
    public static void main (String[] args){
        //INSTANCIAR
        Metodos jose = new Metodos();
        jose.name = "José";
        jose.age = 10;
        jose.height = 999;

        jose.pesar();
        jose.alimentar();
        jose.engordar();
        jose.pesar();

        

    }
}
