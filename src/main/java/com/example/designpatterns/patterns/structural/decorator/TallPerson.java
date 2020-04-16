package com.example.designpatterns.patterns.structural.decorator;

/**
 * Demo TallPerson
 *
 * @author Wolf-Liu
 * @date 2019/12/3 23:33
 */
public class TallPerson implements IPerson {
    private IPerson person;

    public TallPerson(IPerson person) {
        this.person = person;
    }

    @Override
    public int getCharisma() {
        return person.getCharisma() + 10;
    }
}
