package TlintaInterface;

public class InterfaceExec {
    public static void main (String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(599);
        //cc.sacar(500);

        cp.depositar(699);
        //cp.sacar(600);

        GeradorExtrato ge = new GeradorExtrato();
        ge.geraExtrato(cc);
        ge.geraExtrato(cp);

    }
}
