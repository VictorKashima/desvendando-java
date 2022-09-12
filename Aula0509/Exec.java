package Aula0509;

public class Exec {
    public static void main (String args[]){
        Pessoa carro = new Pessoa();
        carro.name = "Vrum Vrum";
        carro.age = 18;
        carro.height = 1.75;
        carro.nationality = "Japonês";
        // carro.printattrs();
        // carro.crescer();
        // carro.printattrs();

        System.out.println("- - - - - - - - - - - - - - - - - - - - - ");

        Pessoa moto = new Pessoa();
        moto.name = "Rommm Rommm";
        moto.age = 21;
        moto.height = 2.20;
        moto.nationality = "Chinês";
        // moto.printattrs();
        // moto.crescer();
        // moto.printattrs();



        Vehicle saveiro = new Vehicle();
        saveiro.brand = "Volkswaven";
        saveiro.model = "Saveiro G4 Surf";
        saveiro.year = 2002;
        saveiro.owner = carro;
        saveiro.printattrs();
        
        saveiro.engine();
        
    }
}
//abc