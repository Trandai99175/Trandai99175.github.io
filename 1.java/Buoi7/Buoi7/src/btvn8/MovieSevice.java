package btvn8;

public class MovieSevice {
    public Movie[] getMovies() {
        Movie[] movies = {
                new Movie (1, "Những người khốn khổ", "Bùi Hiên", "tiểu thuyết", "12/5/2022", "1H30"),
                new Movie (2, "Đắc nhân tâm", "Tô Hoài", "trinh thám", "12/5/2022", "1H40"),
                new Movie (3, "Deep work", "Thu Hằng", "tiểu thuyết", "13/5/2022", "1H50"),
                new Movie (4, "Rèn luyện tư duy phản biện", "Minh Duy", "tiểu thuyết", "15/5/2022", "2H30"),
                new Movie (5, "Nghìn lẻ một đêm", "Minh Trí", "tiểu thuyết", "16/5/2022", "2H10"),

        };
        return movies;
    }


    public void findByTitle(String title) {
        int count = 0;
        for (Movie movies : getMovies ( )) {
            if (movies.title.contains (title)) {
                count++;
                System.out.println (movies);
            }
        }
        if (count == 0) {
            System.out.println ("Không có sách phù hợp Movie với tên là : " + title);
        }
    }
}

