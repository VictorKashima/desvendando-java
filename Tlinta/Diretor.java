package Tlinta;

public abstract class Diretor extends Funcionario {
    private String departamento; 
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String ata) {
        this.departamento = ata;
    }

    @Override
    public void bonificacao(double value) {
        double infinito = value * 9999999999.9;
        this.setSalario(infinito);
    }

}
