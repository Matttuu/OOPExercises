public class TestCircle {  // Save as "TestCircle.java"
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        // Declare an instance of class circle called c3.
        // Construct the instance c3 by invoking the third constructor
        // with the given radius and string.
        Circle c3 = new Circle(3.0, "red");
        // Invoke public methods on instance c3, via dot operator.
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea() + " the color of the cirle is: "
                + c3.getColor());


        /** 3. public vs. private:
         *
         * System.out.println(c3.radius = 3.0);
         * "Error:(33, 30) java: radius has private access in Circle"
         *
         * Radius can only be accessed from the actual class where they are declared.
         * radius variable is set to private, which means it hides from other classes within the package
         * This is why we use getters and setters.
         */

        Circle c4 = new Circle();   // construct an instance of Circle
        c4.setRadius(5.0);          // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("yellow");        // Change color
        System.out.println("color is: " + c4.getColor());   // Print color via getter

        // You cannot do the following because setRadius() returns void,
        // which cannot be printed.
        // System.out.println(c4.setRadius(4.0));

        Circle c5 = new Circle (5.0);
        System.out.println(c5.toString()); //Explicit call.

        Circle c6 = new Circle(1.2);
        System.out.println(c6.toString()); // Explicit call.
        System.out.println(c6);            // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too



    }
}