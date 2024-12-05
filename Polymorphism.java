class Shape {
    void draw() {}
    void erase() {}
}

class Circle extends Shape {
    void draw() { 
         System.out.println("Drawing a circle");
    }
    void erase() {
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape {
    void draw() { 
        System.out.println("Drawing a triangle"); 
    }
    void erase() { 
        System.out.println("Erasing a triangle"); 
    }
}

class Square extends Shape {
    void draw() { 
        System.out.println("Drawing a square");
    }
    void erase() { 
        System.out.println("Erasing a square"); 
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating objects of different shapes 
        Circle c = new Circle(); 
        Triangle t = new Triangle(); 
        Square s = new Square();

        // Demonstrating polymorphism by calling draw and erase methods 
        System.out.println("Using Circle object:"); 
        c.draw(); 
        c.erase(); 

        System.out.println("\nUsing Triangle object:"); 
        t.draw(); 
        t.erase(); 

        System.out.println("\nUsing Square object:"); 
        s.draw(); 
        s.erase();
    }
}
