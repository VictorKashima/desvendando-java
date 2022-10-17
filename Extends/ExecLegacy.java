package Extends;

public class ExecLegacy {
    public static void main (String[] args) {
        Man Victor = new Man();
        Victor.name = "Victor";
        Victor.age = 18;
        Victor.bloodType = "A8+";
        Victor.colorSkin = "Amarelo";

        Cachorro Safira = new Cachorro();
        Safira.name = "Safira";
        Safira.age = 1;
        Safira.bloodType = "A8+";
        Safira.colorPelo = "Caramel";

        BeijaFlor BejaFror = new BeijaFlor();
        BejaFror.name = "Beija Fror";
        BejaFror.NozzleSize = 10;
        BejaFror.EyeColor = "Vermelho";

        Victor.walk();

    }

}