package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class  IsoscelesTriangle extends Triangle  {
    private int base,side;

    public IsoscelesTriangle(int base, int side) {
        this.base = base;
        this.side = side;
    }

    public String getName(){
        return "Triángulo Isósceles";
    }

    public int getSidesCount(){
        return 3;
    }

    public double getPerimeter(){
        return side+side+base;
    }

    public double getArea(){
        return (base*(side^2-(base/2)^2)^(1/2))/2;
    }
}
