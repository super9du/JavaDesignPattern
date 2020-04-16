package com.example.designpatterns.patterns.structural.decorator;

/**
 * Demo FemalePerson
 *
 * @author Wolf-Liu
 * @date 2019/12/4 0:01
 */
public class FemalePerson extends Person {
    private Person person;

    public FemalePerson(Person person) {
        this.person = person;
    }

    @Override
    public int getCharisma() {
        return person.getCharisma() + 10;
    }

    public String combHairs() {
        return "梳头";
    }
}
