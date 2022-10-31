package TlintaInterface;

public class ContaPoupanca implements Conta{
    private double saldo;
    private double limite;
    private int dataAniversario;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public int getDataAniversario() {
        return dataAniversario;
    }
    public void setDataAniversario(int dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void depositar(double valor) {
        if(valor >= 0) {
            this.setSaldo(this.getSaldo()+valor);
            this.setDataAniversario(19);
        }else {
            System.out.println("Não é possível depositar o valor.");
        }
        
    }
    @Override
    public void sacar(double valor) {
        if (this.getSaldo() > 0) {
            this.setSaldo(this.getSaldo()-valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        
    }
    
}
