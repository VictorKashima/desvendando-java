package Pacotao.Task;

public class Funcionario extends Pacotao.Domen.Pessoa {
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calculaSalario (double valor) {
        if (valor < 0) {
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        } else {
            this.salario = this.getIdade()*valor;
        }
    }

    @Override
    public String toString() {
        return "Funcionário: "+this.getNome()+"Cargo: "+this.getCargo()+"Salário: "+this.getSalario();
    }
    

}
