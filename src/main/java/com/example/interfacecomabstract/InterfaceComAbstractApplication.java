package com.example.interfacecomabstract;

import com.example.interfacecomabstract.entities.AbstractShape;
import com.example.interfacecomabstract.entities.Circle;
import com.example.interfacecomabstract.entities.Rectangle;
import com.example.interfacecomabstract.entities.Shape;
import com.example.interfacecomabstract.enums.Color;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterfaceComAbstractApplication {

    public static void main(String[] args) {
       AbstractShape s1 = new Circle(Color.Black, 2.0);
       AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

       System.out.println("Circle color: " + s1.getColor());
       System.out.println("Circle area: " + String.format("%.3f", s1.area()));
       System.out.println("Rectangle color: " + s2.getColor());
       System.out.println("Circle area: " + String.format("%.3f", s2.area()));

    }

}
