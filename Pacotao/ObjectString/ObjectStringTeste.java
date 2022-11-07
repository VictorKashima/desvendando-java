package Pacotao.ObjectString;
import Pacotao.*;
import Pacotao.Task.*;
import Pacotao.Domen.*;

public class ObjectStringTeste {
    public static void main(String args[]) {
        Repositorio rep = new Repositorio();
        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        rep.adiciona(p);
        rep.adiciona(f);
        System.out.println(rep.retornaObjeto());
        rep.removeUltimo();
        System.out.println(rep.retornaObjeto());
        

    }
}
