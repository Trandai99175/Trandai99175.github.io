package btvn8;

public class Movie extends Film{

    private String time;

    public Movie(String time) {
        this.time = time;
    }
    public Movie(int id, String title, String category, String director, String premieredate, String time) {
        super (id, title, category, director, premieredate);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Movie{" +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", premieredate='" + premieredate + '\'' +
                "time='" + time + '\'' +
                '}';
    }


}
