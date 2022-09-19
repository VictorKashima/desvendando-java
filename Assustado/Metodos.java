package Assustado;

public class Metodos{

    //ATRIBUTOS
    String name;
    int age;
    float height;

    //MÉTODOS
    void alimentar(){
        System.out.println(this.name+" ESTÁ ENCHENDO A PANÇA!");
    }

    void engordar(){
        for (int i = 0; i<= 1000; i++){
            this.height += 100;
        }
    }
    
    void pesar(){
        if (this.height >= 1000){
            System.out.println("Você está bem leve.");
            System.out.println(this.height+" Toneladas");
        }
        if (this.height <= 1000){
            System.out.println("Você está magro");
            System.out.println(this.height+" toneladas");
        }
        
    }

}