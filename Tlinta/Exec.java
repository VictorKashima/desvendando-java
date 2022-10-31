package Tlinta;

public class Exec {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(1000);
        System.out.println(g.getSalario());
        g.bonificacao(0.50);
        System.out.println(g.getSalario());

        Secretario s = new Secretario();
        s.setSalario(1000);
        System.out.println(s.getSalario());
        s.bonificacao(500);
        System.out.println(s.getSalario());

    }
}
