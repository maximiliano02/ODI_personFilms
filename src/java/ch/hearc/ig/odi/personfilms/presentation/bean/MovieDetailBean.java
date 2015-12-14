/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personfilms.presentation.bean;

import ch.hearc.ig.odi.personfilms.business.Movie;
import ch.hearc.ig.odi.personfilms.business.Person;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author maximili.jeannere
 */
@Named(value = "movieDetailBean")
@SessionScoped // Session obligatoire, car passe de la liste au détail
public class MovieDetailBean implements Serializable {
    
    private Movie movie;
    
    public String showMovie(Movie movie){
        if(movie != null){
            this.movie = movie;
            return "show";
        }else{
            return "error";
        }
    }

    public Movie getMovie() {
        return movie;
    }
    
    public List<Person> getPeople(){
        return new ArrayList(movie.getPeople().values());
    }
    
    
    
}
