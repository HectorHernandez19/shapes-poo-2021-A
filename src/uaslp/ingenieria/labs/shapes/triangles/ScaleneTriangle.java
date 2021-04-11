package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private int side1, side2, side3;
    private int s;

    public ScaleneTriangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        s = (side1+side2+side3)/2;
    }

    public String getName(){
        return "Triángulo Escaleno";
    }

    public int getSidesCount(){
        return 3;
    }

    public double getPerimeter(){
        return side1+side3+side2;
    }

    public double getArea(){
        return (s*(s-side1)*(s-side2)*(s-side3))^(1/2);
    }
}
