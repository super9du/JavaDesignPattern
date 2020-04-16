package com.example.designpatterns.patterns.structural.decorator;

/**
 * Demo RichPerson
 *
 * @author Wolf-Liu
 * @date 2019/12/3 23:35
 */
public class RichPerson implements IPerson {
    private IPerson person;

    public RichPerson(IPerson person) {
        this.person = person;
    }

    @Override
    public int getCharisma() {
        return person.getCharisma() + 999;
    }
}
