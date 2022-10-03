package Aula0310;

class Pessoa{
    //Atributos
    String name;
    double height;
    static String nationality;

    //Métodos
    static void showNationality(){
        System.out.print("Nationality: ");
        System.out.println(Pessoa.nationality);
    }

}