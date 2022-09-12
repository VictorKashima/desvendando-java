package Aula1209;

public class Employee {
    //Atributos
    String name;
    String role;
    int salary;
    String birthdate;

    //Métodos
    void printAll(){
        System.out.println("Nome: "+this.name);
        System.out.println("Cargo: "+this.role);
        System.out.println("Salário: "+this.salary);
        System.out.println("Data de nascimento: "+this.birthdate);
    }

    void work(){
        System.out.println(this.name+"Está trabalhando muito feliz!");
    }

    double moreMoney(double value){
        double percent = value/this.salary;
        this.salary += value;
        System.out.println("Seu salário foi alterado e agora é: "+this.salary);
        return percent;
    }

}
