package Tlinta;

public class Diretor extends Funcionario {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String ata) {
        this.departamento = ata;
    }

    @Override
    public void bonificacao(double value) {
        double infinito = value * 1000000.0;
        this.setSalario(infinito);
    }

}
