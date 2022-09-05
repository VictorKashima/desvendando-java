package Aula0509;

public class Exec {
    public static void main (String args[]){
        Pessoa carro = new Pessoa();
        carro.name = "Vrum Vrum";
        carro.age = 18;
        carro.height = 1.75;
        carro.nationality = "Japonês";
        carro.printattrs();



        Pessoa moto = new Pessoa();
        moto.name = "Rommm Rommm";
        moto.age = 18;
        moto.height = 2.20;
        moto.nationality = "Chinês";
        moto.printattrs();



    

        // for(carro.age = 15; carro.age <= 30; carro.age++){
        //     System.out.println("Idade do carro: " +carro.age);

        //     if (carro.age <= 20){
        //         carro.crescer();
        //     }
        //     else{
        //         carro.ncresce();
        //     }

        // }

        
    }
}
//abc