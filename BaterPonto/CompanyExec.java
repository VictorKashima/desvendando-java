package BaterPonto;

public class CompanyExec {
    public static void main (String args[]) {
        Estagiario stage = new Estagiario();
        stage.setCargo("Estagiario");
        stage.setArea("Ruim");

        Dev deve = new Dev();
        deve.setCargo("Developer");
        deve.setPlanguage("Node!=Js");

    }
}
