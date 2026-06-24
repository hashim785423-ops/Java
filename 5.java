interface Printable {
    void print();
}

abstract class Shape {
    abstract void area();
}

class Circle extends Shape implements Printable {

    double r = 5;

    void area() {
        System.out.println("Area = " + (3.14 * r * r));
    }

    public void print() {
        System.out.println("Printing Circle Details");
    }
}

public class AbstractInterfaceDemo {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.area();
        c.print();
    }
}
