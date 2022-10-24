public class CircleCalculator {
    public static void main(String[] args) {
        //defining and printing radius
        double circleRadius = 12.0;
        System.out.println("Circle Radius is " + circleRadius);
        //Defining equations
        double circleDiameter = 2*circleRadius,circleCircumference = 2*circleRadius*3.14,circleArea = circleRadius*circleRadius*3.14;
        //prints results
        System.out.println("Circle Diameter is " + circleDiameter);
        System.out.println("Circle circumference is " + circleCircumference);
        System.out.println("Circle area is " + circleArea);
    }
}
