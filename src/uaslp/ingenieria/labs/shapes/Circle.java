package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radio;

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING
    // Sobrecarga = Overloading // polimorfismo
    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras

    public Circle(int radio) {
        this.radio = radio;
    }

    public String getName() {
        return "Circle";
    }

    public int getSidesCount(){return 0;}
    public double getPerimeter(){return 3.141592*radio*2;}

    public double getArea(){return 3.141592*radio*radio;}
}
