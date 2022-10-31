package TlintaInterface;

public class ContaCorrente implements Conta{
    private double saldo;
    private double limite;  

    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    private void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        if(valor >= 0) {
            this.setSaldo(this.getSaldo()+valor);
        }else {
            System.out.println("Não é possível depositar o valor.");
        }
        
    }
    @Override
    public void sacar(double valor) {
        if (this.getSaldo() + this.getLimite() > 0) {
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo()-valor);
            } else {
                double rest = valor - this.getSaldo();
                this.setLimite(this.getLimite() - rest);
            }
            
        } else {
            System.out.println("Saldo insuficiente.");
        }
}

}