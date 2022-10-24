package Netflix;

public class ExecNetflix {
    public static void main (String args[]) {
        Movie filme = new Movie();
        filme.setName("Carros");
        filme.setDistributor("Pixel");
        filme.setGenre("Corrida");

        Serie serie = new Serie();
        serie.setName("Baki");
        serie.setEpisodes(10);

        Player p = new Player();
        p.setBrand("Xiaomi");
        p.play(serie);


    }
}
