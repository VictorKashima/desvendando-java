package Aula1209;

public class Exec{
    public static void main(String args[]){
        //Instanciar a classe
        Employee careca = new Employee();
        careca.name = "Carecabeludo";
        careca.role = "CEO";
        careca.salary = 129393;
        careca.birthdate = "02/02/0002";

        careca.printAll();
        careca.moreMoney(3911);
    }
}