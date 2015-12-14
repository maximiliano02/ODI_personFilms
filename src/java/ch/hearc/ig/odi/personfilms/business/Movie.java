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
 * Classe correspondant à un film, contient la liste des personnes qui a vu le film
 * @author maximili.jeannere
 */
public class Movie {
    private Long id;
    private String name;
    private String producer;
    private Map<Long, Person> people;

    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        people = new HashMap<>();
    }
    
    public void addPerson(Person person) throws UniqueException {
        
        if(!people.containsKey(person.getId())){
            people.put(person.getId(), person);
        }else{
            throw new UniqueException("La personne a deja vu ce film");
        }
    }
    
    public int getNbPerson(){
        return people.size();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Map<Long, Person> getPeople() {
        return people;
    }

    public void setPeople(Map<Long, Person> people) {
        this.people = people;
    }

    
    
    
}
