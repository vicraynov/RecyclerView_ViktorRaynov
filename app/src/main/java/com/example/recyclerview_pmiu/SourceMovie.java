package com.example.recyclerview_pmiu;
import java.util.ArrayList;

public class SourceMovie {
    public static ArrayList<Movie> generateMovieList(){
        ArrayList<Movie>movies=new ArrayList<Movie>();
        movies.add(new Movie("Fast and Furious","Action",2000));
        movies.add(new Movie("Johnny English","Comedy",2003));
        movies.add(new Movie("The Gentlemen","Action",2019));
        movies.add(new Movie("Fast Five","Action",2011));
        return movies;


    }

}
