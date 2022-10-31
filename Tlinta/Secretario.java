package Tlinta;

public class Secretario extends Funcionario{
    private String setor;

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }


    @Override
    public void bonificacao(double valor) {
        this.setSalario(this.getSalario()+valor);
    }

}
