class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(float l, float h) {
        System.out.println(0.5*l*h);
    }
}

class OOPs {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2, 4);
        t1.area();
    }
}
