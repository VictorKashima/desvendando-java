package Aula0509;

public class Pessoa{
    //Atributos
    String name;
    int age;
    double height;
    String nationality;

    //Métodos
    void andar(){
        System.out.println("A PESSOA ESTÁ ANDANDO!");
    }
    void trabalhar(){
        System.out.println("A PESSOA ESTÁ TRABALHANDO NA AGRO ACADEMY");
    }
    void comer(){
        System.out.println("A PESSOA ESTÁ COMENDO ÁGUA");
    }
    void crescer(){
        if(age <= 20){
            this.height += 0.10;
            System.out.println(this.name+" cresceu 10 centímetros");
        }
        else{
            System.out.println(this.name+" não cresceu, porque possui "+this.age);
        }
        

    }

    void printattrs(){
        System.out.println("Nome: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.println("Altura: "+this.height);
        System.out.println("Nacionalidade: "+this.nationality);
    }

}

//Domínio de aplicação == contexto da aplicação
