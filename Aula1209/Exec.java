package Aula1209;

public class Exec{
    public static void main(String args[]){
        //Instanciar a classe
        Employee careca = new Employee();
        careca.name = "Carecabeludo";
        careca.role = "CEO";
        careca.salary = 1500;
        careca.birthdate = "02/02/0002";
        careca.money = 0;
        careca.aporte = 50;

        careca.printAll();
        careca.moreMoney(500);
        System.out.println(careca.moreMoney(3123));
        careca.printAll();

        System.out.println(careca.render(0.5, 1));
    }
}