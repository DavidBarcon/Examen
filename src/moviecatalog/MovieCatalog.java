
package moviecatalog;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import moviecatalog.Control.Command;
import moviecatalog.Control.DirectorSort;
import moviecatalog.Control.DurationSort;
import moviecatalog.Control.GenreSort;
import moviecatalog.Control.ScoreSort;
import moviecatalog.Control.TitleSort;
import moviecatalog.Control.YearSort;
import moviecatalog.Model.Cover;
import moviecatalog.Model.Movie;

public class MovieCatalog {
private static List<Movie> movies= new ArrayList<>();
private static Map<String,Command> commands = new HashMap<>(); 

    public static void main(String[] args) {
        String[] avatarActores = {"david", "pepe"};
        movies.add(new Movie(new Cover("avatar"), "avatar", 2010, "Cameron", avatarActores, "action", 10.0, 200));
        String[] shrekActores = {"juan", "ramon"};
        movies.add(new Movie(new Cover("Shrek"), "Shrek", 2003, "pepito", shrekActores, "infantil", 7.5, 150));
        String[] tryHardActores = {"juan", "ramon"};
        movies.add(new Movie(new Cover("tryHard"), "tryHard", 1998, "manuel", tryHardActores, "action", 5.2, 210));
        
        commands.put("title", new TitleSort(movies));
        commands.put("year", new YearSort(movies));
        commands.put("director", new DirectorSort(movies));
        commands.put("genre", new GenreSort(movies));
        commands.put("score", new ScoreSort(movies));
        commands.put("duration", new DurationSort(movies));
        
        output();
    }
    
    public void addMovie(Movie movie){
        movies.add(movie);
    }
    
    public void removeMovie(Movie movie){
        movies.remove(movie);
    }
    
    static void sort(String f){
        if(commands.get(f).execute() == null) System.out.print(f + "no es un campo valido");       
    }
    
    static void output(){
        System.out.println("in what order do you want to see the movies. The options are: title, year, director, genre, score, duration\n");     
        Scanner scan = new Scanner(System.in);
        String f = scan.nextLine();
        sort(f);
        
        
        Iterator<Movie> iter = movies.listIterator();
        
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        
    }
    
}
