package Netflix;

public class Content {

    private String name;
    private String genre;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    void toPlay() {
        System.out.println(this.name+" Está sendo reproduzido.");
    }

}
