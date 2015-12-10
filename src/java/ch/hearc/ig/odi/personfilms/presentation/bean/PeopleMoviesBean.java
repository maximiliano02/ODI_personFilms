/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personfilms.presentation.bean;

import ch.hearc.ig.odi.personfilms.business.*;
import ch.hearc.ig.odi.personfilms.services.Services;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author maximili.jeannere
 */
@Named(value = "peopleMoviesBean")
@RequestScoped
public class PeopleMoviesBean {
    
    @Inject Services services;

    public PeopleMoviesBean(){
        
    }    
    
    public List<Person> getPeople(){
        return services.getPeopleList();
    }
    
    public List<Movie> getMovies(){
        return services.getMoviesList();
    }
    
    public String showPerson(Person person){
        return "";
    }
}
