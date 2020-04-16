package com.example.designpatterns.patterns.structural.bridge;

/**
 * Demo Triangle
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:10
 */
public class Triangle implements Shape {
    private Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画" + color.getColor() + "三角形");
    }
}
