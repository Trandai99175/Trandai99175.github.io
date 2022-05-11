package btvn8;

public class Film {
    int id;
    String title;
    String category;
    String director;
    String premieredate;

    public Film() {
    }

    public Film(int id, String title, String category, String director, String premieredate) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.premieredate = premieredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getcategory() {

        return category;
    }

    public void setCategory(String category) {
        this.category = category;

    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", premieredate='" + premieredate + '\'' +
                '}';
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPremieredate() {
        return premieredate;
    }

    public void setPremieredate(String premieredate) {
        this.premieredate = premieredate;
    }

}

