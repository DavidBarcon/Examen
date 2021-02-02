/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecatalog.Control;

import java.util.List;
import moviecatalog.Model.Movie;

/**
 *
 * @author david
 */
public interface Command {
    List<Movie> execute();
}
