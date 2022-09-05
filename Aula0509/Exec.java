package Aula0509;

public class Exec {
    public static void main (String args[]){
        Pessoa carro = new Pessoa();
        carro.name = "Vrum Vrum";
        carro.height = 1.10;
        carro.nationality = "Japonês";

        for(carro.age = 0; carro.age <= 100; carro.age++){
            System.out.println("Idade do carro:" +carro.age);

            if (carro.age <= 20){
                carro.crescer();
            }
            else{
                carro.ncresce();
            }

        }

        
    }
}
//abc