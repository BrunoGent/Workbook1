import java.util.Scanner;
public class SquareScannerCalculator {
    public static void main(String[] args) {
        double Height, Width;
        Scanner reader = new Scanner(System.in);
        //loop to exit only when numbers are entered
        do {
            //check for error on input
            try {
                System.out.println("Insert Height");
                Height = reader.nextDouble();
                System.out.println("Insert Width");
                Width = reader.nextDouble();
                //Exit loop if no errors
                break;
            }
            catch (Exception e) {
                System.out.println("Inputs must be all numbers.");
                reader.reset();
                reader.next();
            }
        }
        //if no error in inputs, exit loop
        while(true);

        System. out.println("Height is: " + Height + ", Width is: " + Width);
        System.out.println("Perimeter of Square is: " + 2*(Height+Width));
        System.out.println("Area of Square is: " + Height*Width);
    }
}
