/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecatalog.Control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import moviecatalog.Model.Movie;

/**
 *
 * @author david
 */
public class YearSort implements Command{
    List<Movie> movies = new ArrayList<>();

    public YearSort(List<Movie> movies) {
        this.movies = movies;
    }


    
    

    @Override
    public List<Movie> execute() {
        Collections.sort(movies, Comparator.comparing(Movie::getYear));
        return movies;
    }


    
}
