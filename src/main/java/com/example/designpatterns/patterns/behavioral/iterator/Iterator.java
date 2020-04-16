package com.example.designpatterns.patterns.behavioral.iterator;

/**
 * Demo Iterator
 *
 * @author Wolf-Liu
 * @date 2020/4/16 23:49
 */
public interface Iterator {
    public Object next();

    public boolean hasNext();

    public boolean hasPrevious();
}
