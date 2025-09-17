import java.util.ArrayList;
import java.util.List;

// Lớp Movie
class Movie {
    private String title;
    private int duration; // phút
    private String rating;

    public Movie(String title, int duration, String rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie [Title: " + title +
               ", Duration: " + duration + " phút" +
               ", Rating: " + rating + "]";
    }
}

// Lớp Cinema
class Cinema {
    private List<Movie> movies = new ArrayList<>();
    private static int totalMovies = 0; // đếm tổng số phim

    public void addMovie(Movie m) {
        movies.add(m);
        totalMovies++;
    }

    public void showMovies() {
        System.out.println("Danh sách phim trong rạp:");
        for (Movie m : movies) {
            System.out.println(m);
        }
        System.out.println("Tổng số phim: " + totalMovies);
    }

    public void showLongMovies() {
        System.out.println("Các phim có thời lượng > 120 phút:");
        for (Movie m : movies) {
            if (m.getDuration() > 120) {
                System.out.println(m);
            }
        }
    }
}

// Lớp chạy chương trình
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Movie m1 = new Movie("Avengers: Endgame", 181, "PG-13");
        Movie m2 = new Movie("Spider-Man: Homecoming", 133, "PG-13");
        Movie m3 = new Movie("Doraemon: Nobita và Mặt trăng phiêu lưu ký", 111, "All");

        cinema.addMovie(m1);
        cinema.addMovie(m2);
        cinema.addMovie(m3);

        cinema.showMovies();
        System.out.println();
        cinema.showLongMovies();
    }
}
