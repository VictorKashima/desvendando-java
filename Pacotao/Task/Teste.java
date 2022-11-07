package Pacotao.Task;

public class Teste {
    public static void main(String args[]) {
        Funcionario f = new Funcionario();

        try {
            f.calculaSalario(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Houve erro no sistema, ERROR404!!!!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Houve erro no sistema, ERROR400004!!!");
            System.out.println(e);
        }
     }

     //lenght - conta
     //uppercase - caixaalta
}
