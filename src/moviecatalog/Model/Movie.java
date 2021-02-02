/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecatalog.Model;

/**
 *
 * @author david
 */
public class Movie {
    private Cover cover;
    private String title;
    private int year;
    private String director;
    private String[] actors;
    private String genre;
    private Double score;
    private int duration;

    public Movie(Cover cover, String title, int year, String director, String[] actors, String genre, Double score, int duration) {
        this.cover = cover;
        this.title = title;
        this.year = year;
        this.director = director;
        this.actors = actors;
        this.genre = genre;
        this.score = score;
        this.duration = duration;
    }

    public Cover getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String[] getActors() {
        return actors;
    }

    public String getGenre() {
        return genre;
    }

    public Double getScore() {
        return score;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + ": " +  "year=" + year + ", director=" + director + ", actors=" + actors + ", genre=" + genre + ", score=" + score + ", duration=" + duration + '}';
    }
    
    
    
    
            
}
