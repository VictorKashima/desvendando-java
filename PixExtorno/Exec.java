package PixExtorno;

public class Exec {
    
    public static void main(String args[]){

        SistemaBancario Victor = new SistemaBancario(1000, 1500);
        SistemaBancario Matheus = new SistemaBancario(1000, 1500);

        Matheus.pix(Victor, 1001);

    }

}
