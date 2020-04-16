package com.example.designpatterns.patterns.structural.decorator;

/**
 * Demo HandsomePerson
 *
 * @author Wolf-Liu
 * @date 2019/12/3 23:30
 */
public class HandsomePerson implements IPerson {
    private IPerson person;

    public HandsomePerson(IPerson person) {
        this.person = person;
    }

    @Override
    public int getCharisma() {
        return person.getCharisma() + 100;
    }
}
