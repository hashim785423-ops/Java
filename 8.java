class A {
    A() {
        System.out.println("Class A Constructor");
    }

    void display() {
        System.out.println("Class A Method");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("Class C Constructor");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
