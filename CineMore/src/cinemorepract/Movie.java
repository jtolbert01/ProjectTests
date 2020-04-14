/*
 * Jacob A Carter & Joshua S Tolbert
 */

package cinemorepract;
import java.util.HashMap;

//Holds Information and Accessors for Movies
public class Movie extends Event{
    private long year;
    private String[] genres;
    private String[] cast;
    private long runtime;
    private String mpaa;
    private final String eventType = "Movie";
    
    public Movie(String title, long year, String[] genres, String[] cast, double rating,
            long runtime, String mpaa) {
        setTitle(title);
        this.year = year;
        this.genres = genres;
        this.cast = cast;
        setRating(rating);
        this.runtime = runtime;
        this.mpaa = mpaa;
        setEventType(eventType);
    }
    
    public long getYear() {
        return this.year;
    }
    
    public String[] getGenres() {
        return this.genres;
    }
    
    public String[] getCast() {
        return this.cast;
    }
    
    public long getRuntime() {
        return this.runtime;
    }
    
    public String getMPAA() {
        return this.mpaa;
    }
    
    public String genreToString() {
        String genreList = "";
        int gNum = this.genres.length;
        for (int i = 0; i < gNum; i++) {
            if (i == gNum - 1) {
                genreList = genreList.concat(this.genres[i]);
            }
            else {
                genreList = genreList.concat(this.genres[i] + ", ");
            }
        }
        return genreList;
    }
    
    public String castToString() {
        String castList = "";
        int cNum = this.cast.length;
        for (int i = 0; i < cNum; i++) {
            if (i == cNum - 1) {
                castList = castList.concat(this.cast[i]);
            }
            else {
                castList = castList.concat(this.cast[i] + ", ");
            }
        }
        return castList;
    }
    
    @Override
    public String toString() {
        return "Title: " + getTitle() + "\n Year: " + getYear() + "\n Genres: " +
                genreToString() + "\n Cast: " + castToString() + "\n Rating: " +
                getRating() + "\n Runtime: " + getRuntime() + " mins\n MPAA: " +
                getMPAA();
    }  
}
