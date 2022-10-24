import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Your name: ");

        //Reads a line from user input
        String name = reader.nextLine();

        System.out.println("how old are you?");
        //Reads a String var from keyboard and transfer to an integer

        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Hi " + name +" age " + age);
    }
}
