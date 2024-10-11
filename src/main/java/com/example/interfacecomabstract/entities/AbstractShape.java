package com.example.interfacecomabstract.entities;

import com.example.interfacecomabstract.enums.Color;

/*Para operador deixar naõ implementar a operação area aqui no AbstractShape, teremos que colocar a clase
como abstract*/
public abstract class AbstractShape implements Shape{
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
