package com.example.designpatterns.patterns.structural.decorator;

/**
 * Demo MalePerson
 *
 * @author Wolf-Liu
 * @date 2019/12/3 23:52
 */
public class MalePerson extends Person {
    private Person person;

    public MalePerson(Person person){
        this.person = person;
    }

    @Override
    public int getCharisma() {
        return person.getCharisma();
    }

    public String shaveBeard(){
        return "剃须";
    }

}
