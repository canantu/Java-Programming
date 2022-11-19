package Java_Core_Classes.day31_Constructors.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, String releaseDate, String director, ArrayList<String> casts) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = casts;
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }

    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCasts(String[] castArr){
        casts.addAll(Arrays.asList(castArr));
    }


}
/*
Attributes:
        country (String), title (String), Genre (String),
releaseDate (String), director (String), casts (ArrayList<String>)

Actions
        addCast(String): adds the given string argument
to the arrayList casts
        addCasts(String[]): adds the given string array
argument to the arrayList casts
 */