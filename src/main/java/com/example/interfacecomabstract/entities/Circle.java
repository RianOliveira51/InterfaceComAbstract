package com.example.interfacecomabstract.entities;

import com.example.interfacecomabstract.enums.Color;

public class Circle extends AbstractShape {
    public double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return  Math.PI * radius * radius;
    }
}
