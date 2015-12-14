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
@Named(value = "personDetailBean")
@SessionScoped // Session obligatoire, car passe de la liste au détail
public class PersonDetailBean implements Serializable {
    
    private Person person;
    
    public String showPerson(Person person){
        if(person != null){
            this.person = person;
            return "show";
        }else{
            return "error";
        }
    }

    public Person getPerson() {
        return person;
    }
    
    public List<Movie> getMovies(){
        return new ArrayList(person.getMovies().values());
    }
    
    
    
}
