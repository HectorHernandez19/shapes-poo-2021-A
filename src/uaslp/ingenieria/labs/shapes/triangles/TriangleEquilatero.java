package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;
import java.lang.Math;

public class TriangleEquilatero extends Triangle {
    private double side;

    public TriangleEquilatero(double side) {
        this.side = side;
    }

    public String getName(){
        return "Triángulo Equilatero";
    }

    public int getSidesCount(){
        return 3;
    }

    public double getPerimeter(){
        return side*3;
    }

    public double getArea(){
        return (side*Math.pow(Math.pow(side,2)-Math.pow((side/2),2),.5))/2;
    }
}
