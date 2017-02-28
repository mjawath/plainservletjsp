/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.service;

import com.test.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AJawath
 */
public class PersonService {
private static ArrayList list = new ArrayList();

    public PersonService() {
        for (int i = 0; i < 100; i++) {            
            Person person = new Person();
        
            person.setId("id "+i);
            person.setCountry("country "+i);
            person.setName("Name "+i);
            list.add(list);
        }
    }


    public List getAllPersons(){
        
        
        return list;
    }
    
    public Person createPerson(Person p) {
        //validate 
	list.add(p);
        return p;
    }
}
