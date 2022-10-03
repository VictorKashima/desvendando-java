package Aula0310;

public class PessoaExec {
    public static void main (String args[]){

        //nationality está ligado à classe e não ao objeto.
        Pessoa.nationality = "Brasileira";

        System.out.println("P1: " +Pessoa.nationality);
        System.out.println("P2: " +Pessoa.nationality);

        Pessoa.showNationality();

    }
}
