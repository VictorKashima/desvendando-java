package Tlinta;

public abstract class Funcionario {
    private double salario;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void bonificacao(double valor);

}