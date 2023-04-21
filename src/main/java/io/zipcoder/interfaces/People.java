package io.zipcoder.interfaces;

import java.util.List;

public class People {
    private List<Person> personList;

    public void add(Person p){
        personList.add(p);
    }

    public Person findById(Long id){
        for(Person p : personList){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
}
