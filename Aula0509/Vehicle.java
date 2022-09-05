package Aula0509;

public class Vehicle {
    //Atributos
    String brand;
    String model;
    int year;
    Pessoa owner;



    //Métodos
    void printattrs(){
        System.out.println("Marca: "+this.brand);
        System.out.println("Modelo: "+this.model);
        System.out.println("Ano: "+this.year);
        System.out.println("Dono: "+this.owner.name);
        System.out.println("Dados do proprietário:");
        this.owner.printattrs();
    }
    void engine(){
        System.out.println("TSTSTSTSTSTSTSTSTSTSTSTS VRUUUUUUUUUUUUMMMMMMMMMMMM");
    }

}
