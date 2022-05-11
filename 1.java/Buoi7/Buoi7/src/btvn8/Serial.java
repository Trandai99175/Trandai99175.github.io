package btvn8;

public class Serial extends Film{
    private int episodes;
    private String averageduration;

    public Serial() {
    }

    public Serial(int id, String title, String category, String director, String premieredate, int episodes, String averageduration) {
        super (id, title, category, director, premieredate);
        this.episodes = episodes;
        this.averageduration = averageduration;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getAverageduration() {
        return averageduration;
    }

    public void setAverageduration(String averageduration) {
        this.averageduration = averageduration;
    }

    @Override
    public String toString() {
        return "Serial{" +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", premieredate='" + premieredate + '\'' +
                "episodes=" + episodes +
                ", averageduration='" + averageduration + '\'' +
                '}';
    }
}
