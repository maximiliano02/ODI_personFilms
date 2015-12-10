/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personfilms.business;

import ch.hearc.ig.odi.personfilms.exception.UniqueException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe correspondant à une personnes, elle contient la liste de filmes qu'elle a vue
 * @author maximili.jeannere
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;    
    private Map<String, Movie> movies;

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        movies = new HashMap<>();
    }
    
    public void addMovie(Movie movie) throws UniqueException {
        
        if(!movies.containsKey(movie.getName())){
            movies.put(movie.getName(), movie);
        }else{
            throw new UniqueException("Le film a déja été regardé par la personne");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
