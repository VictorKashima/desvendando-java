package Netflix;

public class Serie extends Content{
    private int episodes;

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    void toPlay(int name,int episodes) {
        super.toPlay();
        System.out.println("Episode: "+this.episodes);
    }

}
