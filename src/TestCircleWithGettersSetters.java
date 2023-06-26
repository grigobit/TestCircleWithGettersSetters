public class TestCircleWithGettersSetters {
    public static void main(String[] args) {

        System.out.println("the number of objects is: " + Circle.getNumberOfObjects());
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println("the number of objects is: " + Circle.getNumberOfObjects());
        System.out.println("Circle1 radius is: " + circle1.getRadius());
        System.out.println("Now I will change the radius of Circle 1: ");
        circle1.setRadius(5.0);
        System.out.println("Circle1 radius now is: " + circle1.getRadius());
        System.out.println("-------------CIRCLE 2------------------");
        System.out.println("Circle2 radius is:" + circle2.getRadius());
        System.out.println("Total number of objects created: " + Circle.getNumberOfObjects());
        System.out.println("Attempting to set Circle2 radius to a negative number:");
        circle2.setRadius(-1);
        System.out.println("Circle2 radius now is: " + circle2.getRadius());
        System.out.println("Seting Circle2 radius 3.0");
        circle2.setRadius(3.0);
        System.out.println("Circle2 radius now is: " + circle2.getRadius());
        System.out.println("Increasing the radius of Circle2 by 10% ");
        circle2.setRadius(circle2.getRadius() * 1.1);
        System.out.println("Circle2 radius has now become: " + circle2.getRadius());
    }
}