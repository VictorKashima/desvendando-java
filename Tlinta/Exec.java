package Tlinta;

public class Exec {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(1000);
        System.out.println(g.getSalario());
        g.bonificacao(1.5);
        System.out.println(g.getSalario());

        System.out.println("- - - - - -");

        Secretario s = new Secretario();
        s.setSalario(1000);
        System.out.println(s.getSalario());
        s.bonificacao(500);
        System.out.println(s.getSalario());

    }
}
