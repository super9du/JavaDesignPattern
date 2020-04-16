package com.example.designpatterns.patterns.structural.bridge;

/**
 * Demo Square
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:07
 */
public class Square implements Shape {
    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画" + color.getColor() + "正方形");
    }
}
