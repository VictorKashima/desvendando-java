package Tlinta;

public class Gerente extends Funcionario{
    private String setor;

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void bonificacao(double valor) {
        double porcent = (1.0*valor);
        this.setSalario(this.getSalario()*porcent);
    }

}
